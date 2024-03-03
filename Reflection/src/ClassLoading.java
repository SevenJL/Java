public class ClassLoading {
    public static void main(String[] args) throws ClassNotFoundException {
        //Cat cat = new Cat();
        //new A();
//        System.out.println(A.num);
          //1
        //100
//        Class cls =Class.forName("java");

    }
}
class A{
    static {
        System.out.println("1");
        num = 200;
    }
     static int num = 100;

    public A() {
        System.out.println("2");
    }

    //属性 =  成员变量 = 字段
    //链接阶段-准备 属性是如何处理的
    private int n1 = 10;
    //n1是实例变量 不是静态变量 在准备阶段不会分配内存
    private static int age = 10;
    //n2是静态变量 分配内存 n2默认初始化为0 在初始化阶段才会真正为10
    private static final int n3 = 20;
    //n3是static final类型 他和静态变量不一样,一旦赋值就不变了 在准备阶段 n3就直接赋值为30
}