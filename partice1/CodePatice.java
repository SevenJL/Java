public class CodePatice {
    public static void main(String[] args) {
//        //1.创建对象实例（new)
//        AA aa =new AA();//AA!
//        //2.创建子类对象的实例，子类的父类的也会被加载
//        //父类先被加载，子类后被加载
//        AA aa2 =new AA();//BB! AA!
//        //3.使用类的静态成员时（静态属性，静态方法）
//        System.out.println(BB.n1); //BB! 9
//
//
//        DD dd = new DD();
//        DD dd1 =new DD();

//         System.out.println(DD.n1);
        new BBB();
        Cat1 c1 = new Cat1();
    }
}

class BB{
    public static  int n1 = 9;

    //静态代码块
    static {
        System.out.println("BB!");
    }
}
class AA extends BB{

    //静态代码块
    static {
        System.out.println("AA!");
    }
}
class DD{
    public static int n1 = 8;

    static {
        System.out.println("DD的静态代码块!");
    }

    {
        System.out.println("DD的普通代码块!");
    }
}

class AAA{
    {
        System.out.println("AAA的普通代码块");
    }
    static {
        System.out.println("AAA的静态代码块");
    }
    public AAA() {
        //1.super();
        //2.调用本类的普通代码块
        System.out.println("AAA()的构造器被调用");
    }
}
class BBB extends AAA{
    {
        System.out.println("BBB的普通代码块");
    }
    static {
        System.out.println("BBB的静态代码块");
    }
    public BBB(){
        System.out.println("BBB()的构造器被调用");
    }
}
class Cat1 {
    private  String name;
    public  static  int n1 = 999;
    private static Cat1 cat1;//初始化为null
    private Cat1(String name){
        System.out.println("构造器被调用...");
        this.name = name;
    }
    public  static  Cat1 getInstance(){
        System.out.println("1");
        if(cat1 == null){
            cat1 = new Cat1("小可爱");
        }
        return cat1;
    }

//    public static void main(String[] args) {
//        System.out.println(Cat1.n1);
//        Cat1.getInstance();
//
//    }
}
class Sample{
    Sample(String s){
        System.out.println(s);
    }
    Sample(){
        System.out.println("Sample默认构造器被调用");
    }
}
class Test{
    Sample sam1 = new Sample("sam1成员初始化");//3
    static Sample sam = new Sample("静态成员sam初始化");//1
    static {
        System.out.println("static块执行");//2
        if(sam == null){
            System.out.println("sam is null");
        }
    }
    Test(){
        //构造器
        //super（）
        //普通代码块和普通属性
        System.out.println("Test默认构造函数被调用");//4
    }
}

    public static void main(String[] args) {
        Test a = new Test();//无参构造器
    }
}