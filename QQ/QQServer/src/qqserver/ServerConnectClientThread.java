package qqserver;


import qqcommon.Message;
import qqcommon.MessageType;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
@SuppressWarnings("all")
public class ServerConnectClientThread extends Thread{
    private Socket socket;
    private String userId;

    public Socket getSocket() {
        return socket;
    }

    public String getUserId() {
        return userId;
    }

    public ServerConnectClientThread(Socket socket, String userId) {
        this.socket = socket;
        this.userId = userId;
    }
    @Override
    public void run() {//发送和接收信息
        while (true){
            try {
                System.out.println("客户端线程"+userId+"保持通信....");
                ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
                Message message = (Message) objectInputStream.readObject();
                if(message.getMesType().equals(MessageType.MESSAGE_GET_ONLINE_FRIED)){
                    //客户端要获取在线用户列表
                    System.out.println(message.getSender()+"要在线用户列表");
                    String onlineUser = ManageClientThread.getOnlineUser();

                    //返回
                    //构建一个Message对象 返回给客户端
                    Message message2 = new Message();
                    message2.setMesType(MessageType.MESSAGE_RET_ONLINE_FRIED);//消息类型
                    message2.setContent(onlineUser);//用户列表
                    message2.setGetter(message.getSender());//send变getter

                    //返回给客户端
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
                    objectOutputStream.writeObject(message2);//返回消息

                } else if (message.getMesType().equals(MessageType.MESSAGE_CLIENT_EXIT)) {
                    //客户端要提出
                    System.out.println(message.getSender()+"退出系统...");
                    //将客户端对应的线程 从集合删除
                    ManageClientThread.removeClientThread(message.getSender());
                    socket.close();//关闭连接
                    //退出while循环
                    break;
                } else if (message.getMesType().equals(MessageType.MESSAGE_COMM_MES)) {
                    //根据Message获取getterId
                    ServerConnectClientThread serverConnectClientThread =
                            ManageClientThread.getServerConnectClientThread(message.getGetter());

                    ObjectOutputStream objectOutputStream =
                            new ObjectOutputStream(serverConnectClientThread.socket.getOutputStream());
                    objectOutputStream.writeObject(message);
                } else if (message.getMesType().equals(MessageType.MESSAGE_ALL_COMM_MES)) {
                    //需要遍历 管理线程的集合 把所用的线程的Socket得到
                    HashMap<String, ServerConnectClientThread> hashMap =
                            ManageClientThread.getHashMap();
                    Iterator<String> iterator = hashMap.keySet().iterator();
                    while (iterator.hasNext()) {
                        //取出在线用户的id
                        String onlineUser = iterator.next().toString();
                        if(!onlineUser.equals(message.getSender())){
                            //排除群发消息的这个人
                            ObjectOutputStream objectOutputStream =
                                    new ObjectOutputStream(hashMap.get(onlineUser).socket.getOutputStream());
                            objectOutputStream.writeObject(message);
                        }
                    }
                } else if (message.getMesType().equals(MessageType.MESSAGE_FILE_MES)) {
                    ServerConnectClientThread serverConnectClientThread =
                            ManageClientThread.getServerConnectClientThread(message.getGetter());
                    ObjectOutputStream objectOutputStream =
                            new ObjectOutputStream(serverConnectClientThread.socket.getOutputStream());
                    objectOutputStream.writeObject(message);
                        //如果没有匹配到相应的id
                        //说明没有在线
                } else if (message.getMesType().equals(MessageType.MESSAGE_QUIT_MES)) {
                    ServerConnectClientThread serverConnectClientThread =
                            ManageClientThread.getServerConnectClientThread(message.getGetter());
                    if(serverConnectClientThread == null) {
                        String content = ((Message) objectInputStream.readObject()).getContent();
                        List<Message> messageList = new ArrayList<>();
                        Message message1 = (Message) objectInputStream.readObject();
                        messageList.add(message1);
                        //保存到list数组中
                        //一直循环等待这个线程在线
                        while(ManageClientThread.getServerConnectClientThread(message.getGetter()) !=null){
                            //发送信息
                            ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
                            for (int i = 0; i < messageList.size(); i++) {
                                objectOutputStream.writeObject(messageList.get(i));
                            }
                        }
                        break;
                    }
                }
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
