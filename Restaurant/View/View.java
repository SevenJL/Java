package View;
import Variable.Bill;
import Tools.Utility;
import service.Service;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;


public class View {
    private char key = ' ';//用来选择每个模块的12345
    private Service service = new Service(10);//初始化一个菜单

    private double spendMoney = 0;//记录顾客花费的金钱
    private String dishName = " ";
    private  double temp = 0;
    private String tempName = " ";
    private boolean loop = true;

    public void orderMenu() {//点菜
        double temp = 0;
        String tempName = " ";
        int buyNums = 0;
        int index = -1;//初始化下标，用来保存所要买的菜系的ID，方便后面进行访问
        do{
            index = -1;
            service.printDish();//先输出菜单
            while (index == -1) {
                System.out.print("请输入你要购买商品的名字：");
                dishName = Utility.readString(7);
                //判断输入的是否合法
                //检查是否有这个商品

                for (int i = 0; i < Service.foodNums; i++) {
                    if (dishName.equals(service.list()[i].getName())) {
                        //进入到循环，说明有这个菜系
                        index = service.list()[i].getId() - 1;//保存这个菜系的下标
                        break;
                    }
                }

                //寻找菜系
                if (index == -1) {
                    System.out.println("找不到该菜系!");
                }
            }
            System.out.print("请输入购买的数量：");
            buyNums = Utility.judgeInt(service.list()[index].getNumber());

            //使用 " index " 直接访问到了这个菜系的库存
            //计算顾客购买菜系所花费的钱
            if (buyNums <= service.list()[index].getNumber()) {//判读库存是否足够
                spendMoney = buyNums * service.list()[index].getPrice();
                //判断完库存是否足够，再判断顾客的余额是否足够
                if (service.getCustomerBalance() < spendMoney) {
                    //说明余额不足
                    System.out.println("余额不足，请重新输入");
                    //返回到点菜界面
                    orderMenu();
                }

                System.out.println("下单成功！");
                temp +=spendMoney;//创建临时变量保存订单的钱数
                tempName += (dishName+" *"+buyNums+"份 ");
            } else {
                System.out.println("库存不足！");
                System.out.println("请重新输入!");
                System.out.println();
                orderMenu();//库存不足时，返回到点菜界面
            }
            //是否继续买菜
            System.out.println("是否继续点菜？");
            char c = Utility.readConfirmSelection();
            if (c == 'N') {
                //退出点菜
                spendMoney =temp;//把总加钱赋给花费的
                loop = false;
            }

        }while(loop);
        //更改库存
        //下单成功后，生成一个订单
        Bill(tempName,temp,index,buyNums);//输入菜名和总共的价格
        Service.idDishCounter++;//计算订单数
        service.setFoodNums(service.list()[index].getNumber()-buyNums);

        //更改顾客的余额
        //余额为总余额减去花费的余额
        service.setCustomerBalance(service.getCustomerBalance()-spendMoney);

        System.out.println("你当前还剩余额为："+service.getCustomerBalance());

    }

    public void mainMenu() {
            System.out.println();
            System.out.println("欢迎来到起点炒个菜，请选择你身份面前的数字：");
            System.out.println("1.厨师\t 2.顾客\t 3.退出");
            System.out.print("请 输 入 你 的 选 择：");
            //判断输入的是否非法
            key = Utility.judgeInput('4');
            switch (key) {
                case '1':
                    service.cook();//访问厨师的模块
                    //当密码和账号都输入正确后，就有权限访问后厨权限了，这是可以直接访问
                    subMenu();
                    break;
                case '2':
                    customer();//访问顾客的模块
                    break;
                case '3':
                    System.out.println("退出！");
            }
    }
    public void customer(){//顾客模块
          System.out.println("欢迎光临！！");
          System.out.println("-------------------顾客模块------------------------");
          System.out.println("1.查看菜单");
          System.out.println("2.点菜");
          System.out.println("3.查看余额");
          System.out.println("4.返回上一级");
          System.out.print("请 输 入 你 的 选 择：");
          //判断输入的是否非法
          key = Utility.judgeInput('5');
          switch (key) {
              case '1':
                  //查看菜单
                  service.printDish();
                  //返回到顾客界面
                  customer();
                  break;
              case '2':
                  //点菜
                  orderMenu();
                  customer();
                  break;
              case '3':
                  //查看余额
                  customerCheckBalance();
                  customer();
                  break;
              case '4':
                  //返回上一级
                  mainMenu();
                  break;
          }
    }

    public void subMenu(){
      System.out.println("-----------------后厨管理模块---------------------");
      System.out.println("1.仓库管理");
      System.out.println("2.菜单管理");
      System.out.println("3.订单管理");
      System.out.println("4.查看余额");
      System.out.println("5.返回上一级");
      System.out.print("请输入你的选择：");
        //判断输入的是否非法
        //defualt不好进行再次输入key选择所需要的操作
        //直接自定义一个jugeInput输入装置，可以让我们更好判断输入的是否在这些选择之中
        //如果输入不是012345这种的，就显示 “ 输入错误，重新输入 ”
        key = Utility.judgeInput('6');
      switch (key){
          case '1'://仅仅对于菜品的数量的增加和减少
              //访问仓库
              store();
              break;
          case '2':
              //访问菜单管理
              manageMenu();
              break;
          case '3':
              //订单管理
              service.delBill();
              subMenu();
              break;
          case '4':
              //查看厨师余额
              cookCheckBalance();
              break;
          case '5':
              //返回上一级
              mainMenu();
              break;
      }
  }

    public void store(){//仓库
      System.out.println("---------------仓库管理模块---------------");
      System.out.println("1.查看库存");
      System.out.println("2.炒菜");
      System.out.println("3.扔菜");
      System.out.println("4.返回上一级");
      System.out.println();
      System.out.print("请输入你的选择：");
        //判断输入的是否非法
        key = Utility.judgeInput('5');
      switch (key){
          case '1':
              //查看库存后返回到仓库管理模块
              service.printDish();
              store();
              break;
          case '2':
              //实现炒菜功能
              service.friedDish();
              store();
              break;
          case '3':
              //扔菜
              service.throwDish();
              store();
              break;
          case '4':
              //返回上一级
              subMenu();
              break;
      }
  }

    public void manageMenu(){//菜单管理
      System.out.println("-------------------菜单模块------------------------");
      System.out.println("1.查看菜单");
      System.out.println("2.修改菜单");
      System.out.println("3.删除特色菜");
      System.out.println("4.增加特色菜");
      System.out.println("5.返回上一级");
      System.out.print("请输入你的选择：");
        //判断输入的是否非法
        key = Utility.judgeInput('6');
      switch (key){
          case '1':
              //调出菜单
              service.printDish();
              manageMenu();
              break;
          case '2':
              //修改菜单
              service.alterMenu();
              //修改完菜单之后先打印出修改后的菜单
              service.printDish();
              //再返回上一级
               manageMenu();
              break;
          case '3':
              //删除菜系
              service.delDish();
              manageMenu();
              break;
          case '4':
              //在菜单中增加菜系
              service.addDish();
              manageMenu();
              break;
          case '5':
              //返回后厨管理模块
              subMenu();
              break;
      }
    }

    public void Bill(String foodName,double totalPrice,int index, int buyNums){

        //创建随机数
        UUID uuid = UUID.randomUUID();
        String uuidString = uuid.toString();//把UUID转化为String类型，方便输入和进行比较

        //输出时间（AI写的，还没学到输出这个时间）
        // 获取当前的阳历时间
        LocalDateTime currentDateTime = LocalDateTime.now();
        // 定义日期时间格式
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        // 格式化输出当前时间
        String formattedDateTime = currentDateTime.format(formatter);

        //创建一个新的订单
        int id =Service.idDishCounter+1;
        foodName = foodName;
        Bill newBill = new Bill(id,uuidString,foodName,totalPrice,formattedDateTime);
        System.out.println("-------------------订单列表------------------------");
        //把这个新订单添加到bills数组里面
        index = -1;//来判断订单是否满了

        for (int i = 0; i < service.listBill().length; i++) {
            if (service.listBill()[i] == null){
                index = i;//找到下标
                break;
            }
        }
        if(index == -1){
            //说明这个订单数组满了
            System.out.println("当前订单太多，请稍后再来下单！");
            customer();
        }
        //把这个新的订单添加到这个订单数组里面去
        service.listBill()[index] = newBill;
        service.printBill();
    }

    public void cookCheckBalance(){//厨师的余额
        //后厨的余额
       service.setCookBalance(service.getCookBalance()+spendMoney);
        System.out.println("-------------------查看余额------------------------");
        System.out.println("当前余额为："+service.getCookBalance());
        System.out.println("-------------------当前余额------------------------");
        subMenu();
    }
    public void customerCheckBalance(){
        System.out.println("-------------------查看余额------------------------");
        System.out.println("您当前余额为"+service.getCustomerBalance());
        System.out.println("-------------------当前余额------------------------");
    }
}
