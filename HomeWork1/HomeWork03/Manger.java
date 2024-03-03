package HomeWork03;

public class Manger extends Worker{
    public Manger(String name, double datSalary, int day, double garde) {
        super(name, datSalary, day, garde);
    }
    public void print(){//重写
        System.out.println(getName());
        System.out.println(getDay());
        System.out.println(1000+getDatSalary()*getDay()*getGarde());
        //打印部门经理工资
    }
}
