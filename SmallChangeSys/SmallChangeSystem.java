import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSystem {
    //1.先写出菜单，给出对应的处理
    public static void main(String[] args) {

        //定义布尔值
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);//输入

        //接受选择
        String key = "";

        //2.完成零钱通明细
        String details = "----------------零钱通明细------------------";


        //3.完成入账
        double money = 0;
        double balance = 0;
        //日期
        Date date = null;//date 是java.util 类型，表示日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//用于日期格式化的对象
        //保存消费的原因和金额
        String note = "";


        do{//菜单最好显示一次

            System.out.println("======================菜单=================");
            System.out.println("\t\t\t1.零钱通明细");
            System.out.println("\t\t\t2.收益入账");
            System.out.println("\t\t\t3.消费");
            System.out.println("\t\t\t4.退出");
            System.out.println("请选择 1-4 ");
            System.out.println("==========================================");
            System.out.println();
            key = scanner.next();//接受输入的值

            //使用switch分支结构

            switch (key){
                case "1":
                    System.out.println(details);
                    //输出零钱通明细
                    break;
                case "2":
                    //3.完成零钱通入账
                    System.out.print("收益入账金额：");
                    money =scanner.nextDouble();
                    //要校验是否合理

                    //**找出不正确的金额**而不是找正确的金额，把不正确的金额的条件，然后给出提示即可
                    if(money<=0 ){//收益入账为负的或者零
                        System.out.println("收益入账金额，需要大于0");
                        break;//打道回府，返回到上面输入金额的的代码
                    }
                    //
                    balance +=money;
                    //拼接收益入账信息到details
                    //得到时间
                    date = new Date();//获取当前日期
                    //SimpleDateFormat sdf = null;用于日期格式化的对象
                    details +="\n收益入账\t+"+money+"\t" +sdf.format(date)+"\t" + "\t余额为 "+balance;
                    break;
                case "3":
                    //4.消费
                    System.out.print("消费金额：");
                    money =scanner.nextDouble();
                    //继续校验
                    //找出不正确的情况
                    if(money <=0 || money >balance){
                        System.out.println("消费金额应该在0~"+balance);
                        break;
                    }
                    System.out.print("消费说明:");
                    note = scanner.next();
                    balance+=money;
                    //拼接消费信息
                    date = new Date();
                    details +="\n"+note+"\t-"+money+"\t" +sdf.format(date)+"\t" +"\t余额为 "+ balance;
                    break;
                case "4":
                    String choice ="";
                    while(loop){
                        System.out.println("确定要退出吗？y/n");
                        choice =scanner.next();
                        //必须输出一个Y或者N,否则就一直循环
                        if ("y".equals(choice) || "n".equals(choice)){
                            break;
                        }else{
                            System.out.println("输入非法，请重新输入！");
                        }
                    }
                    //当用户退出while，进行判断
                    if (choice.equals("y")) {
                        loop = false;//直接退出
                    }
                    break;
                default:
                    System.out.println("输入非法，请重新输入！");
            }
        }while (loop);
        System.out.println("==============退出零钱通==================== ");
    }
}
