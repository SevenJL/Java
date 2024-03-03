package src.Service;



import src.qqcommon.Message;
import src.qqcommon.MessageType;
import src.qqcommon.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class UserClient {
    //该类完成登录验证 等等功能
    private User user;
    //我们可能在其他地方使用这个User信息
    private Socket socket;//因为socket可能在其他地方使用,因做出属性

    public boolean checkUser(String userId, String pwd) throws IOException, ClassNotFoundException {

        boolean b =false;
        //根据密码和id去验证该用户是否合法
        //创建user对象
        user.setUserID(userId);
        user.setPassword(pwd);

        //连接服务器 然后发送对象
        socket = new Socket(InetAddress.getLocalHost(), 9999);

        //得到objectOutputStream对象
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
        //发送对象
        objectOutputStream.writeObject(user);

        //读取从服务器回复的Message对象
        ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
        Message message = (Message) objectInputStream.readObject();

        if(message.getMesType().equals(MessageType.MESSAGE_LOGIN_SUCCEED)){

            //创建一个和服务器保持通信的线程 创建一个类ClientConnectServerThread

            ClientConnectServerThread clientConnectServerThread =
                    new ClientConnectServerThread(socket);
            //启动客户端的线程
            clientConnectServerThread.start();
            //为了后面客户端的扩展,我们需要将线程放入到集合中
            ManageClientConnectServerThread.addClientConnectServerThread(userId, clientConnectServerThread);
            b = true;

        }else{
            //如果登录失败
            //不能启动和服务器通信的线程
            //关闭socket
            socket.close();

        }



        return b;
    }
}
