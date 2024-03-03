import java.io.Serializable;
import java.lang.reflect.Field;

public class Reflection2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, InstantiationException, IllegalAccessException {

//        Cat cat = new Cat();
//        Class cls =Class.forName("Cat");
//        Class cls1 =Class.forName("Cat");
//        System.out.println(cat.hashCode());//1956725890
//        System.out.println(cls.hashCode());//1163157884
//        System.out.println(cls1.hashCode());//1163157884
//
//        //获取当前Class类的接口
//        Class[] interfaces = cls.getInterfaces();
//        for (Class anInterface : interfaces) {
//            System.out.println(anInterface);
//            //interface java.io.Serializable
//        }
//
//        //获取当前Class类的加载器
//        ClassLoader classLoader = cls.getClassLoader();
//        System.out.println(classLoader);
//        //sun.misc.Launcher$AppClassLoader@18b4aac2
//        //返回是哪一个加载器加载的


//        String classAllPath = "Car";
//        //1.获取car类对应的class对象
//        Class<?> cls = Class.forName(classAllPath);
//        System.out.println(cls);
//        //class Car
//        //2.显示cls对象,是哪个类运行的Class对象 Car
//        System.out.println(cls.getClass());
//        //class java.lang.Class 运行类型
//        //3.得到包名
//        //System.out.println(cls.getPackage().getName());
//        //4.得到类名
//        System.out.println(cls.getName());//Car
//        //5.通过cls创建对象实例
//        Car car = (Car) cls.newInstance();
//        System.out.println(car);//Car{brand='BWM', price=5000000, color='BLACK'}
//        //6.通过反射获取属性brand
//        Field brand = cls.getField("brand");
//        Object o = brand.get(car);
//        System.out.println(o);//BWM
//
//        //7.通过反射给属性赋值
//        brand.set(car, "奔驰");
//        System.out.println(brand.get(car));//奔驰
//
//        //8.获取所有的字段属性
//        Field[] fields = cls.getFields();
//        for (Field f: fields
//             ) {
//            System.out.println(f.getName());
//        }
        //brand
        //price
        //color


//        //1.获取car类对应的class对象
//        String classAllPath = "Car";
//        Class<?> cls = Class.forName(classAllPath);
//        System.out.println(cls);
//        //class Car
//
//        //2.类名.class 应用场景:用于参数传递
//        Class cls2 =Car.class;
//        System.out.println(cls2);
//        //class Car
//
//        //3.对象.getClass() 应用场景,有对象实例
//        Car car = new Car();
//        Class cls3 = car.getClass();
//        System.out.println(cls3);
//        //class Car
//
//        //4.通过类加载器来获取类的Class对象
//        //4.1先得到类加载器Car
//        ClassLoader classLoader = car.getClass().getClassLoader();
//        //4.2通过类加载器得到Class对象
//        Class cls4 = classLoader.loadClass("Car");
//        System.out.println(cls4);
//        //class Car
//
//        //5.基本数据类型 也能得到相应的Class类对象
//        Class<Integer> integerClass = int.class;
//        Class<Boolean> booleanClass = boolean.class;
//        System.out.println(integerClass);//int
//        System.out.println(booleanClass);//boolean
//
//        //6.基本数据类型对应的包装类 可以通过 .TYPE 得到Class类对象
//        Class<Integer> type = Integer.TYPE;
//        Class<Boolean> type1 = Boolean.TYPE;
//        System.out.println(type);//int
//        System.out.println(type1);//boolean


//        Class<String> stringClass = String.class;//外部类
//        Class<Serializable> serializableClass = Serializable.class;//接口
//        Class<Integer[]> aClass = Integer[].class;//数组
//        Class<float[][]> aClass1 = float[][].class;//二维数组
//        Class<Deprecated> deprecatedClass = Deprecated.class;//注解
//        Class<Thread.State> stateClass = Thread.State.class;//State也是枚举
//        Class<Void> voidClass = void.class;//void数据类型
//        Class<Class> classClass = Class.class;//Class也是类



        Class<Integer> integerClass1 = Integer.class;
        System.out.println(integerClass1.hashCode());//1163157884


        Class<Integer> integerClass = int.class;//基本数据类型
        Class<Integer> type = Integer.TYPE;
        System.out.println(integerClass.hashCode());//1956725890
        System.out.println(type.hashCode());//1956725890






    }
}
