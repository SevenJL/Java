package qqserver;



import qqcommon.Message;
import qqcommon.MessageType;
import qqcommon.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class QQServer {
    public static void main(String[] args) throws IOException {
        new QQServer();
    }
    private ServerSocket serverSocket = null;
    //创建一个集合存多个用户
    private static HashMap<String,User> validUsers = new HashMap<>();
    //使用ConcurrentHashMap 处理并发的合集  没有线程安全
    static {
        //静态代码块初始化
        validUsers.put("100", new User("100","123456"));
        validUsers.put("200", new User("200","123456"));
        validUsers.put("300", new User("300","123456"));
        validUsers.put("400", new User("400","123456"));
        validUsers.put("500", new User("500","123456"));
        validUsers.put("600", new User("600","123456"));
    }
    private boolean checkUser(String userId,String pwd){
        //验证用户是否有效的方法
        User user = validUsers.get(userId);
        if(user == null){
            //说明userId不存在
            return false;
        }
        //useId正确 但是密码是否正确
        return user.getPassword().equals(pwd);
    }
    public QQServer()
            throws IOException {
        try {
            System.out.println("服务器端在9999端口监听....");
            //启动新闻推送的线程
            new Thread(new SendNewToAllService()).start();

            serverSocket = new ServerSocket(9999);
            //端口可以写在配置文件中
            //监听9999要循环一直监听Socket
            while (true) {
                //当和某个客户端连接后,会继续监听,因此while
                Socket socket = serverSocket.accept();//没有客户端连接就会阻塞在这里
                // 通过Socket读取客户端发送的对象

                //通过Socket关联的对象输入流
                ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
                //读取客户端发送的User对象 强转为User对象 然后使用get,set方法去判断账号密码是否存在
                User user = (User) objectInputStream.readObject();
                //创建一个Message对象,准备回复客户端
                Message message = new Message();
                //....
                //验证 用户是否存在服务器上的数据
                if (checkUser(user.getUserID(), user.getPassword())) {
                    //合法用户
                    message.setMesType(MessageType.MESSAGE_LOGIN_SUCCEED);
                    //将Message对象回复给
                    objectOutputStream.writeObject(message);
                    //创建一个线程,和客户端保持通信,该线程需要持有Socket
                    ServerConnectClientThread serverConnectClientThread =
                            new ServerConnectClientThread(socket, user.getUserID());
                    //启动线程
                    serverConnectClientThread.start();
                    //把该线程对象放入集合中进行管理
                    ManageClientThread.addClientThread(user.getUserID(), serverConnectClientThread);
                } else {//登录失败
                    message.setMesType(MessageType.MESSAGE_LOGIN_FAIL);//
                    objectOutputStream.writeObject(message);
                    socket.close();
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            //如果退出while循环,说明服务器不在监听,因此关闭ServerSocket
            serverSocket.close();
        }
    }
}
