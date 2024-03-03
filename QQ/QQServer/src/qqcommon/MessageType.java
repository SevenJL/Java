package qqcommon;

public interface MessageType  {
    //不同的常量值 表示不同的消息类型
    String MESSAGE_LOGIN_SUCCEED = "1";
    String MESSAGE_LOGIN_FAIL = "2";
    String MESSAGE_COMM_MES = "3";//普通的信息包
    String MESSAGE_GET_ONLINE_FRIED = "4";//要求返回用户在线列表
    String MESSAGE_RET_ONLINE_FRIED = "5";//返回用户在线列表
    String MESSAGE_CLIENT_EXIT = "6";//客户端请求退出
    String MESSAGE_ALL_COMM_MES = "7";
    String MESSAGE_FILE_MES = "8";//发送文件的消息
    String MESSAGE_QUIT_MES = "9";//离线消息







}
