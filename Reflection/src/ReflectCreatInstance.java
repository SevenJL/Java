import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectCreatInstance {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {

        //1.先获取User的class对象
        Class<?> useraClass = Class.forName("User");

        //2.通过public的无参构造器创建实例
        Object o = useraClass.newInstance();
        System.out.println(o); //age =10  name =dick

        //3.通过public的有参构造器创建实例
        //先得到对应的构造器 再去创建实例 并传入实参
        Constructor<?> constructor = useraClass.getConstructor(String.class);
        //这个Constructor对象代表public User(String name){...}
        Object o1 = constructor.newInstance("tom");
        System.out.println(o1);//age =10  name =tom

        //4.通过非public的有参构造器创建实例
        Constructor<?> constructor1 = useraClass.getDeclaredConstructor(int.class, String.class);
        //getDeclaredConstructor获取所有的构造器 包括私有的
        constructor1.setAccessible(true);//进行暴破 使用反射可以访问私有的构造器
        //先进行暴破 再创建实例
        Object user2 = constructor1.newInstance(100, "dicker");
        System.out.println(user2);





        //访问属性
//        Class<?> aClass = Class.forName("Cat");
        //创建对象
//        Object o2 = aClass.newInstance();
//        System.out.println(o2.getClass());//class Cat
//        //使用反射得到age 属性对象
//        Field age = aClass.getField("age");
//        age.set(o2, 23);//通过反射来操作值
//        System.out.println(o2);//Cat{name='TOM', age=23}
//        //使用反射操作name
//        Field declaredField = aClass.getDeclaredField("name");
//        declaredField.setAccessible(true);//进行暴破
//        declaredField.set(o2, "dicker");//Cat{name='dicker', age=23}
//        declaredField.set(null, "dasd");//Cat{name='dasd', age=23}
//        //得到对象
//        System.out.println(o2);
//
//        //必须为静态 否则不能使用
//        System.out.println(declaredField.get(o2));//dasd




        //得到class对象
        Class<?> aClass = Class.forName("Cat");
        //创建对象
        Object o2 = aClass.newInstance();
        //调用public方法
        //Method hi = aClass.getMethod("hi");
        Method hi = aClass.getDeclaredMethod("hi");
        //调用方法
        Object asd = hi.invoke(o2);
        System.out.println(asd);//hi null

        Method cry = aClass.getDeclaredMethod("cry");
        //因为cry方法是私有的 需要爆破才能调用
        cry.setAccessible(true);
        Object invoke = cry.invoke(o2);
        System.out.println(invoke);//~~~ null
        System.out.println(cry.invoke(null, null));
        //cry为静态属性 所以直接用null也行
        //~~~   null
        //在反射中 如果有返回值 统一返回Object
        //编译类型以Object接受


    }
}
class User{
    private int age = 10;
    private String name = "dick";
    public User(){
    //无参构造器
    }
    public User(String name){//public有参构造器
        this.name = name;
    }
    private User(int age, String name){//private有参构造器
        this.name = name;
        this.age = age;

    }
    public String toString(){
        return  "age ="+age+"  name ="+name;
    }
}