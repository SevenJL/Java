package service;

import Variable.Bill;
import Tools.Utility;
import Variable.Dish;

public class Service {
    private final String account  = "admin";//账号
    private final String password = "123456";//密码

    private Dish[] food;//食物信息
    public static int foodNums = 4;//记录有几个菜
    private int billNums = 1;
    private int idCounter = 4;//记录ID，方便后面增加菜系时候，自动增加ID
    public static int idDishCounter = 1;
    public int index = 0;//数组下标
    private final Bill[] bills = new Bill[5];  // 初始化一个包含5个元素的数组
    private int choice = 3;//登入账号时剩余的机会
    private double customerBalance = 200.0;//初始化顾客的余额
    private double cookBalance = 1000.0;//初始化厨师的余额

    public Service(int size){//size用来表示这个菜单中最多有几个菜系
        food = new Dish[size];//创建一个数组来保存菜单信息
        //初始化菜单，有四个菜
        food[0] = new Dish(1,"鸡蛋炒大米",5,"好吃不贵",23);
        food[1] = new Dish(2,"鸡蛋炒黄瓜",4,"好吃的很",40);
        food[2] = new Dish(3,"鸡蛋炒鸡蛋",7,"好吃的很",20);
        food[3] = new Dish(4,"鸡蛋炒辣椒",14,"好贵的很",30);
        //初始订单
        bills[0]=new Bill(1,"5dd965ba-6685-4bcc-9e90-0353604318d4","鸡蛋炒大米 * 4份",20,"2023年11月28日 05:29:24 ");//初始化一个订单

    }

    public void friedDish(){
        //实现炒菜的功能
        //先输出菜单，选择要炒哪个菜系
        //炒菜就是增加库存
        printDish();//列出菜单
        String dishName = " ";//初始化要炒的菜系的名字
        //再炒菜
        System.out.print("你想炒的菜系：");
        boolean loop = true;//控制下面循环
      while(loop) {
          dishName = Utility.readString(7);
          index = -1;//判读输入的是否有这个菜系
          for (int i = 0; i < foodNums; i++) {
              if (dishName.equals(food[i].getName())) {
                  index = i;
                  loop = false;
              }
          }
          if (index == -1) {
              System.out.print("输入错误，请重新输入:");
          }
      }
        //去菜单中查找这个菜系
        for (int i = 0; i < food.length; i++) {
            if (dishName.equals(food[i].getName())){
                System.out.print("你想炒的数量：");
                int dishNums= 0;
                loop = true;
                while (loop) {
                    dishNums = Utility.readInt();//输入炒菜的数量
                    if (dishNums < 0) {
                        //输入错误
                        System.out.print("输入错误！请重新输入：");
                        continue;
                    }
                    loop = false;
                }
                //把炒过的菜的数量改变  炒完的库存=原来的数量+炒的数量
                food[i].setNumber(food[i].getNumber()+dishNums);
                System.out.println("炒菜成功！");

                //判断是否继续炒菜
                //如果不炒返回上一级
                char c = Utility.readConfirmSelection();
                if (c =='Y'){
                    System.out.println("继 续 炒 菜 ！");
                    friedDish();//调用炒菜方法，继续炒菜
                    return;
                } else if (c == 'N') {
                    System.out.println("退 出 炒 菜 ");
                    break;
                }
                break;
            }
        }
    }



    public void addDish() {
        boolean loop = true;
        do {
            System.out.println("-------------------添加菜系------------------------");
            System.out.print("菜系：");
            String name = " ";
            index = -1;
            while (index == -1) {
                index = 0;
                name = Utility.readString(7);
                for (int i = 0; i < foodNums; i++) {
                    if (name.equals(food[i].getName())) {
                        index = -1;//判读输入的是否有这个菜系
                    }
                }
                if (index == -1) {
                    System.out.println("该菜系已经存在，请重新输入！");
                    addDish();
                    return;
                }
            }
            System.out.print("价格：");
            double price = Utility.readInt(5); // 价格最高5位数
            System.out.print("描述：");
            String desc = Utility.readString(10); // 最多描述10个字
            System.out.print("库存：");
            int nums = Utility.readInt();

            // 创建一个新的对象，来保存所添加的菜系
            Dish newFood = new Dish(1, name, price, desc, nums);

            if (addDish(newFood)) {
                System.out.println("添加成功！");
                loop =false;
            } else {
                System.out.println("添加失败！");
                loop = true;
            }
            // 添加完之后，是否继续添加
            System.out.println("是否继续添加？");
            char c = Utility.readConfirmSelection();
            if (c == 'N') {
                System.out.println("返回上一级");
                return;
            } else if (c == 'Y') {
                System.out.println("继续添加");
                loop = true;
            }
        } while (loop);
    }


    public void alterMenu(){
        //先打印菜单
        printDish();
        System.out.print("请输入要修改菜系的ID：");
        //用一个变量来接受所要修改的菜系的ID
        int ID = Utility.readInt();
        //接受之后去菜单中寻找是否有这个菜系，也就是这个输入的ID是否正确
        if (ID > idCounter){
            //说明输入的id超出了菜单的范围
            System.out.println("该菜系不存在，请重新输入");
            alterMenu();//调用修改菜单的方法
        }
        //如果没有超出范围，说明可以进行修改菜单
        //这时候我们要列出要修改的这个菜系的所有信息
        System.out.println("-------------------修改菜系------------------------");
        System.out.print("请输入食品名称：");
        String name  = Utility.readString(7,"");

        System.out.print("请输入食品价格：");
        //判读输入价格是否合理
        double price = Utility.judgePrice();
        System.out.print("请输入描述：");
        String scr =Utility.readString(10,"");

        int number =food[ID-1].getNumber();//找到该菜系的库存

        //用一个新的对象来代替原来的对象
        Dish newFood = new Dish(ID,name,price,scr,number);
        food[ID-1] = newFood;//把新的对象赋给原来的对象，完成修改

        System.out.println(name+" 修改成功！");
    }


    public boolean addDish(Dish newFood) {
        //先判断数组是否已经满了
        if (foodNums == food.length) {
            //添加菜系的大小等于数组长度，说明数组已经满了
            System.out.println("菜单已满，不能再添加了");
            return false;
        }

        food[foodNums++] =newFood;//把新的菜系赋给菜单
        newFood.setId(++idCounter);//ID按序增加
        return true;
    }

    public void throwDish(){
        //扔菜就是清理库存
        //减少库存数量‘

        index = -1;
        do {
            //先列出菜单
            printDish();
            System.out.print("你想要扔的菜名：");
            String name = Utility.readString(10);
            //搜索菜单中是否有这个菜系
            for (int i = 0; i < foodNums; i++) {
                if (name.equals(food[i].getName())) {
                    //说明有这个菜
                    index = i;
                }
            }
            if (index == -1) {
                //说明没有这个菜
                System.out.println("输入错误，请重新输入！");
            }
            if (food[index].getNumber() == 0) {
                //说明没有库存了，就无法扔菜
                System.out.println("该菜系已经没有库存了,请重新选择!");
                index = -1;
            }
        }while(index == -1);
        //接下来就说明有这个菜系
        System.out.print("你想扔的菜系的数量：");
        int number = Utility.judgeInt(food[index].getNumber());
        //判断有没有该库存


        //判断是否要真的删除
        System.out.println("是否要真的删除?");
        char c = Utility.readConfirmSelection();
        //判断是否删除
        if (c == 'Y'){
            //我们需要找到这个菜系的库存
            //并且修改
            food[index].setNumber(food[index].getNumber() - number);
            //修改完毕
            System.out.println("扔菜成功！");
        } else if (c == 'N') {
            System.out.println("扔菜失败！");
            //返回到上一级
        }
    }




    //修改菜单
    public void delDish(){//删除菜系方法
        //先判断菜单中是否还有菜系
        if(foodNums == 0){
            //说明菜单中没有菜系了
            System.out.println();
            System.out.println("该菜单已经没有菜系了!");
            //直接返回
            return;
        }
        //再列出菜单
        printDish();

        //先获取要删除菜系的ID
        System.out.print("请输入要删除菜系的ID：");
        //用变量来接收
        int id = Utility.readInt();
        //接受之后去菜单中寻找是否有这个菜系，也就是这个输入的ID是否正确
        if (id > idCounter){
            //说明输入的id超出了菜单的范围
            System.out.println("该菜系不存在，请重新输入");
            delDish();//调用删除菜系的方法
        }
        //如果没有超出范围，说明可以进行删除菜系
        //是否真的删除
        System.out.println("是否真的删除?");
        char c =Utility.readConfirmSelection();
        if(c == 'N'){
            System.out.println("取消删除！");
            return;
        }
        //把后面的菜系往前移动
        //先判断删除的这个菜系后面是否有菜系
        index = -1;
        for (int i = 0; i < foodNums; i++) {
            if (id == food[i].getId()) {
                //说明有菜系
                index = i;//记录下标
            }
            //说明后面没有其他菜系了
            //直接把最后一个菜系变为null
        }
        if (index == -1){
            //说明后面没有其他菜系了
            System.out.println("该菜系不存在，请重新输入");
            delDish();
        }
        for (int i = index; i < foodNums-1; i++) {//后面的菜系依次往前移动
            food[i] = food[i+1];
        }
        food[--foodNums] =null;//菜单最后一个销毁，避免重复
        printDish();
    }

    public void printDish(){//打印菜单
        System.out.println("---------------------菜单-------------------------");
        for (int i = 0; i <food.length; i++) {//遍历菜单中所以菜系
            //判断是否有这个菜系
            if(food[i] ==null){
                break;//如果访问到空指针直接退出
            }
            System.out.println(food[i]);//打印
        }
        System.out.println("-------------------食品列表------------------------");
    }

    public void printBill(){//打印订单
        System.out.println("-------------------订单列表------------------------");
        for (int i = 0; i < listBill().length; i++) {
            if(listBill()[i] == null){
                break;//遇到null直接退出
            }
            System.out.println(listBill()[i]);
        }
        System.out.println("-------------------订单列表------------------------");

    }

    public void delBill(){
        if(idDishCounter == 0){
            //说明菜单中没有菜系了
            System.out.println();
            System.out.println("没有任何订单了!");
            //直接返回
            return;
        }
        printBill();

        //判读是否处理订单
        System.out.println("是否要处理订单？");
        char c =Utility.readConfirmSelection();
        if (c == 'N'){
            return;
        }
        int idNums = idDishCounter;
        String id = " ";//初始id
        System.out.print("请选择你要处理的订单的UUID：");

        do {
            id = Utility.readString(50);
            index = -1;
            for (int i = 0; i < idDishCounter; i++) {
                if (id.equals(bills[i].getUUID())) {
                    //说明找到了
                    index = i;
                }
            }
            if (index == -1) {
                System.out.print("未找到该订单的UUID，请重新输入：");
            }
        }while (index == -1);

        try {//休眠
            Thread.sleep(400);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("正在处理订单.");

        try {//休眠
            Thread.sleep(400);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("正在处理订单..");

        try {//休眠
            Thread.sleep(400);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } System.out.println("正在处理订单...");

        try {//休眠
            Thread.sleep(400);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("正在处理订单....");

        //其他订单依次向前移动
        for (int i = idDishCounter; i < idNums; i++) {//后面的菜系依次往前移动
            bills[i] = bills[i+1];
        }

        //把这个订单从这个账单上删去
        bills[--idDishCounter] = null;//删除这个订单

        //处理完毕
        System.out.println("该订单处理完毕！");
    }

    public void cook(){//进入厨师模式
        System.out.println("欢 迎 回 厨 ！");
        System.out.println("注意，你有三次登录管理系统的机会");
        //测试输入账号是否正确
        for(;;) {//使for循序一直循序
            index = -1;
            detect();
            if (index == -1) {
                //输入账号或密码错误，减少机会
                if (choice == 1){
                    System.out.println("三次机会用完,请三秒后再次尝试！");//当三次机会使用完成之后，就自动退出系统

                    try {//休眠三秒
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    choice = 3;//重新设置尝试次数
                    cook();
                    break;
                }
                System.out.println("还有" + --choice + "次机会");
            } else {
                System.out.println("登入成功，欢迎大厨！！！");
                break;
            }
        }
    }
    public void detect(){//检测账号和密码是否错误

        System.out.print("请输入账号：");
        String Account= Utility.readString(5);//限制10个字符，如果不对改为默认值
        System.out.print("请输入密码：");
        String Password = Utility.readString(6);//密码限制6位,如果不对改为默认值

        //根据equals来判读账号和密码是否错误
        if(Account.equals(account)){//判断账号输入的是否正确
            index = 1;
        }

        if(index == -1){
            System.out.println("你输入的账号不正确！");
            return;
        }

        if (!Password.equals(password)) {//判断密码是否正确
            index= -1;
        }

        if (index == -1){
            System.out.println("你输入的密码不正确！");
        }
    }


    public  Dish[] list(){//列出所有菜系
        return food;
    }
    public Bill[] listBill(){//返回的是账单
        return bills;
    }
    public void setFoodNums( int foodNums) {
        this.foodNums = foodNums;
    }
    public double getCustomerBalance() {
        return customerBalance;
    }

    public void setCustomerBalance(double customerBalance) {
        this.customerBalance = customerBalance;
    }

    public double getCookBalance() {return cookBalance; }

    public void setCookBalance(double cookBalance) {
        this.cookBalance = cookBalance;
    }
}

