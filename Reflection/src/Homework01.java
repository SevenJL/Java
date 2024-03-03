import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Homework01 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        Class<?> aClass = Class.forName("PrivateTest");
        Object o = aClass.newInstance();
        Field field = aClass.getDeclaredField("name");
        field.setAccessible(true);
        field.set(o, "dicker");

        Method declaredMethods = aClass.getDeclaredMethod("getName");
        declaredMethods.setAccessible(true);
        Object invoke = declaredMethods.invoke(o, null);
        System.out.println(invoke);//dicker
        boolean b = "asd" instanceof String;
        System.out.println(b);



        String s1 = "e:\\mynew.txt";
        Class<?> aClass1 = Class.forName("java.io.File");
        Constructor<?>[] constructors = aClass1.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
        /**File所有的构造器
         * public java.io.File(java.lang.String,java.lang.String)
         * public java.io.File(java.lang.String)
         * public java.io.File(java.io.File,java.lang.String)
         * public java.io.File(java.net.URI)
         */
        Method creatNewFile = aClass1.getMethod("createNewFile");
        //单独得到构造器
        Constructor<?> declaredConstructor = aClass1.getDeclaredConstructor(String.class);
        //public java.io.File(java.lang.String)
        Object file = declaredConstructor.newInstance(s1);
        //file运行类型就是File
        System.out.println(file.getClass());//class java.io.File
        creatNewFile.invoke(file);//创建成功

    }
}
class PrivateTest{
    private String name = "hellokitty";
    public String getName(){
        return name;
    }
    private void m1(){
        this.getName();
    }

}

