package view;

import domain.House;
import service.HouseService;
import utils.Utility;

//显示界面
//显示用户的输入
//调用houseService完成对房屋信息的各种操作
public class HouseView {
    //实现代码的三部曲：明确  完成功能-思路分析-代码实现

    //显示主菜单
    //属性
    private  boolean loop =true;
    private char key = ' ';
    private HouseService houseService = new HouseService(10);//设置数组大小为10

    //根据Id查找房屋信息
    public void findHouse(){
        System.out.println("=============查找房屋信息============");
        System.out.print("请输入要查找的Id：");
        int findId  = Utility.readInt();
        //调用方法

        House house = houseService.findById(findId);
        if (house != null){
            System.out.println(house);
        }else{
            System.out.println("=============查找的房屋信息ID不存在===============");
        }
    }
    //编写一个删除房屋，接受输入的id，调用Service的del方法
    private void delHouse(){
        System.out.println("==================添加房屋信息===================");
        System.out.println("请输入待删除房屋的编号（-1退出）：");
        int delId = Utility.readInt();
        if (delId == -1){
            System.out.println("==============放弃删除房屋信息============");
            return;
        }
        char choice = Utility.readConfirmSelection();

        if (choice == 'Y'){//确认删除
            if (houseService.del(delId)){
                System.out.println("=====================删除房屋信息====================");
            }else{
                System.out.println("编号不存在，删除失败！");
            }
        }else{
            System.out.println("================放弃删除房屋信息=================");
        }
    }


    public void exit(){
        char c = Utility.readConfirmSelection();
        if (c == 'Y') {
            loop = false;
        }
    }







    public void addHouse(){
        System.out.println("===============添加房屋=================");
        System.out.print("姓名：");
        String name =Utility.readString(8);//名字最多8个字
        System.out.print("电话号码：");
        String phone = Utility.readString(12);
        System.out.print("地址：");
        String address = Utility.readString(16);
        System.out.print("月租：");
        int rent = Utility.readInt();
        System.out.print("状态：");
        String state =Utility.readString(3);

        //创建一个新的house对象，注意id，是系统分配的，用户不能输入，要系统自动分配，自增长分配
        House newHouse =new House(0,name,phone,address,rent,state);

        if (houseService.add(newHouse)){
            System.out.println("==============添加房屋成功===================");
        }else{
            System.out.println("================添加房屋======================");
        }
    }
    //显示房屋列表
    public void listHouses(){
        System.out.println("===========房屋列表=============");
        System.out.println("编号\t\t\t房主\t\t\t电话\t\t\t地址\t\t\t月租\t\t\t状态（未出租\\已出租）");
        House[] houses = houseService.list();
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null) {
                break;//如果数组中的元素为空就不用显示了
            }
            System.out.println(houses[i]);
        }
        System.out.println("========房屋列表显示完毕=========");
    }
    public void mainMenu(){
          do {
              System.out.println("============房屋出租系统==========");
              System.out.println("\t\t\t1. 新 增 房 源");
              System.out.println("\t\t\t2. 查 找 房 屋");
              System.out.println("\t\t\t3. 删 除 房 屋 信 息");
              System.out.println("\t\t\t4. 修 改 房 屋 信 息");
              System.out.println("\t\t\t5. 房 屋 列 表");
              System.out.println("\t\t\t6. 退 出");
              System.out.println("请输入你的选择（1-6）");
              key = Utility.readChar();
              switch (key){
                  case '1':
                     addHouse();
                      break;
                  case '2':
                      findHouse();
                      break;
                  case '3':
                      delHouse();
                      break;
                  case '4':
                      System.out.println("修 改");
                      break;
                  case '5':
                      listHouses();
                      break;
                  case '6':
                      exit();
                      break;
              }
          }while (loop);
    }
}
