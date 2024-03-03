package Chat;

import src.Service.UserClient;
import util.Utility;

import java.io.IOException;

public class QQView {

    private boolean loop = true;
    private String key = " ";
    private UserClient userClient = new UserClient();//用于登录服务器

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        new QQView().mainMenu();
    }
    private void mainMenu() throws IOException, ClassNotFoundException {
        while (loop){
            System.out.println("==========欢迎登录网络通信系统==============");
            System.out.println("\t\t\t\t1.登录系统");
            System.out.println("\t\t\t\t9.退出系统");
            System.out.print("请输入你的选择:");
            key = Utility.readString(1);
            //根据用户输入来处理不同的逻辑
            switch (key){
                case "1":
                    System.out.println("登录系统");
                    loginSystem();
                    break;
                case "9":
                    System.out.println("退出系统");
                    loop = false;
                    break;
                default:
                    System.out.println("输入错误");
            }

        }
    }
    private void loginSystem() throws IOException, ClassNotFoundException {
        System.out.print("请输入用户号:");
        String userId = Utility.readString(50);
        System.out.print("请输入密码:");
        String pwd = Utility.readString(50);

        //中间省略验证代码
        if(userClient.checkUser(userId, pwd)){
            //
            //进入到二级菜单
            while (true) {
                System.out.println("===========欢迎用户\"" + userId + "\"登录============");
                System.out.println("\t\t 1.显示用户在线列表");
                System.out.println("\t\t 2.群发信息");
                System.out.println("\t\t 3.私聊消息");
                System.out.println("\t\t 4.发送文件");
                System.out.println("\t\t 9.退出系统");
                System.out.println("请输入你的选择:");
                key = Utility.readString(1);
                switch (key) {
                    case "1":
                        System.out.println("显示用户在线列表");
                        break;
                    case "2":
                        System.out.println("群发消息");
                        break;
                    case "3":
                        System.out.println("私聊消息");
                        break;
                    case "4":
                        System.out.println("发送文件");
                        break;
                    case "9":
                        loop = false;
                        break;

                }
            }
        }else{
            System.out.println("=========登录失败=======");
        }
    }
}
