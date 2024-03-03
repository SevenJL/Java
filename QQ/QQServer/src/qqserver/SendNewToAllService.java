package qqserver;

import qqcommon.Message;
import qqcommon.MessageType;
import util.Utility;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class SendNewToAllService implements Runnable{



    @Override
    public void run() {
        while(true) {
            System.out.println("请输入服务器要推送的新闻(输入exit 退出推送服务)");
            String news = Utility.readString(100);
            if("exit".equalsIgnoreCase(news)){
                break;
            }
            //构建一个群发消息的类型
            Message message = new Message();
            message.setMesType(MessageType.MESSAGE_ALL_COMM_MES);
            message.setSender("服务器");
            message.setContent(news);
            message.setSendTime(new Date().toString());
            System.out.println("服务器推送消息给所有人 说: " + news);
            //遍历当前所用的通信线程
            HashMap<String, ServerConnectClientThread> hashMap =
                    ManageClientThread.getHashMap();
            Iterator<String> iterator = hashMap.keySet().iterator();
            while (iterator.hasNext()) {
                String onlineUser = iterator.next();
                ServerConnectClientThread serverConnectClientThread = hashMap.get(onlineUser);
                try {
                    ObjectOutputStream objectOutputStream =
                            new ObjectOutputStream(serverConnectClientThread.getSocket().getOutputStream());
                    objectOutputStream.writeObject(message);

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
