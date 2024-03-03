public class asd12 {
    public static void main(String[] args) {

        ABC abc = new ABC();
    }
}
class ABC {
    public  static int n1 = 1;
    public ABC(){
        System.out.println("3");
    }
    public static void print(){
        System.out.println("2");
    }

    static {
        System.out.println("4");
    }
    {
        System.out.println("5");
    }
}
abstract class Template{
    //抽象类
    public abstract void job();//抽象方法
    public void caleTimes(){
        //统计当前时间差ms
        long start = System.currentTimeMillis();
        job();
        long end = System.currentTimeMillis();
        System.out.println("耗时"+(end - start));
    }
}
class AAAA extends Template{
    @Override
    public void job() {
        for (int i = 0; i < 90; i++) {
            
        }
    }
}