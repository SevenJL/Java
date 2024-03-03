package qqserver;

import java.util.HashMap;
import java.util.Iterator;

public class ManageClientThread {
    //该类用于管理客户端通讯的线程
    private static HashMap<String,ServerConnectClientThread> hashMap=
            new HashMap<>();//创建Hashmap进行管理客户的线程

    public static HashMap<String,ServerConnectClientThread> getHashMap(){
        return hashMap;
    }
    //添加线程对象到hashmap集合
    public static void addClientThread(
            String useId,ServerConnectClientThread serverConnectClientThread){
        hashMap.put(useId, serverConnectClientThread);
        //传进行参数
    }
    //根据userId返回线程
    public static ServerConnectClientThread getServerConnectClientThread(
            String useId){
        return hashMap.get(useId);
    }

    //返回在线用户列表
    public static String getOnlineUser(){
        //集合遍历 遍历key
        Iterator<String> iterator = hashMap.keySet().iterator();
        String onlineUser = "";
        while (iterator.hasNext()) {
            onlineUser += iterator.next().toString()+"\n";
        }
        return  onlineUser;
    }
    public static void removeClientThread(String userId){
        hashMap.remove(userId);
    }





}
