package src.Service;


import src.qqcommon.Message;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ClientConnectServerThread extends Thread{
    //该线程要持有Socket
    private Socket socket;
    public ClientConnectServerThread(Socket socket){
        this.socket =socket;
    }
    //为了更方便的得到Socket

    @Override
    public void run() {
        //因为Thread需要在后台和服务器通信,因此我们while循环
        while (true){
            System.out.println("客户端线程,等待从服务器端发送的消息");
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
                Message message = (Message) objectInputStream.readObject();
                //如果服务器没发送Message对象,就会阻塞在这里

            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }

        }

    }

    public Socket getSocket() {
        return socket;
    }
}
