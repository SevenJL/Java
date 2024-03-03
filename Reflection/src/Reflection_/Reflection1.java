package Reflection_;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

@SuppressWarnings("all")
public class Reflection1 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\cat.properties"));
        String classfullpath = properties.getProperty("classfullpath").toString();
        String methodName = properties.getProperty("method").toString();
        String methodName1 = properties.getProperty("method1").toString();
        System.out.println(classfullpath);//Cat
        System.out.println(methodName);//hi
        System.out.println(methodName1);//cry

        //反射机制的解决
        //1.加载类,返回Class类型的对象cls
        Class cls = Class.forName(classfullpath);
        //2.通过cls得到你加载的类 src.Cat 的对象实例 相当于 new Cat()
        Object o = cls.newInstance();
        System.out.println("o的运行类型=" + o.getClass());
        //o的运行类型=class Cat
        //3.通过cls得到吗加载类的src.Cat 的methodName 的方法对象
        //既在反射中,可以把方法视为对象
        Method method = cls.getMethod(methodName);
        //4.通过method调用方法:既通过方法来实现调用方法
        method.invoke(o);
        //你好

        //Filed对象表示某个类的成员变量
        //getFiled不能得到私有属性
        Field nameField = cls.getField("age");
        System.out.println(nameField.get(o));
        //10

        //Constructor对象表示构造器
        Constructor constructor = cls.getConstructor();
        System.out.println(constructor);
        //public Cat()
        //()中可以指定构造器参数类型
        //默认返回无参构造器

        Constructor constructor2 = cls.getConstructor(String.class, int.class);
        //这里传入的String.class 就是String类的对象Class对象
        System.out.println(constructor2);//Cat(String name,int age)
        //public Cat(java.lang.String,int)

        Method hi = cls.getMethod("hi");
        hi.setAccessible(true);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            hi.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);//531




    }

    public static void m3() throws
            ClassNotFoundException, NoSuchMethodException, InstantiationException,
            IllegalAccessException, InvocationTargetException {
        Class cls = Class.forName("src.Cat");
        Object o = cls.newInstance();



    }


}
@SuppressWarnings("all")
class Cat1 {
    private String name = "TOM";
    public int age = 10;
    public void hi(){
    }
    public void cry(){
        System.out.println("~~~");
    }
    public Cat1(){}
    public Cat1(String name, int age){
        this.name = name;
        this.age = age;
    }
}