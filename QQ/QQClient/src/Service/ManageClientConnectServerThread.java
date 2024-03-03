package src.Service;

import java.util.HashMap;

public class ManageClientConnectServerThread {
    //key =userId  value = Thread;
    private static HashMap<String,ClientConnectServerThread> hashMap = new HashMap<>();

    public static void addClientConnectServerThread (String uesrId,ClientConnectServerThread clientConnectServerThread){
        hashMap.put(uesrId,clientConnectServerThread);
    }
    //通过usedId得到对应的线程
    public static ClientConnectServerThread getClientConnectServerThread(String userId){
        return hashMap.get(userId);
    }

}
