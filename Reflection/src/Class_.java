import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Class_ {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Scanner scanner = new Scanner(System.in);
        String key = scanner.next();
        switch (key){
            case "1":
                //静态加载,依赖性强 需要编译时就加载这个类
                Dog dog = new Dog();
                dog.cry();
                break;
            case "2":
                //反射加载类是 动态加载
                Class cls = Class.forName("Person");
                Object o = cls.newInstance();
                Method method = cls.getMethod("hi");
                method.invoke(o);
                System.out.println("ok");
                break;
            default:
                System.out.println("do nothing....");
        }
        //new Dog()是静态加载,因此必须编写Dog
        //Person类是动态加载,所以没有编写Person类也不会报错,只有加载到该类时,才会报错
    }
}
class Dog{
    public void cry(){}
}
                                      