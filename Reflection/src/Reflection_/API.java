package Reflection_;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class API {
    public static void main(String[] args) throws ClassNotFoundException {
        //先得到class对象
        Class<?> personClass = Class.forName("Reflection_.Person");
        //getName得到全类名
        System.out.println(personClass.getName());//Reflection_.Person
        //getSimpleName获取简单类名
        System.out.println(personClass.getSimpleName());//Person
        //getFields获取所有public修饰的属性,包含本类以及父类的
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
            //name
            //superName
        }
        //getDeclareFields获取本类所有属性
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName());
            //name
            //age
            //job
            //sal
        }
        System.out.println();
        //getMethods获取所有public修饰的方法 包括本类及父类的方法
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
        //m1//superMethod//wait//wait//wait//equals//toString//hashCode//getClass//notify//notifyAll
        System.out.println();
        //getConstructors获取public修饰的构造器








    }

}
class A {
    public String superName;
    public void superMethod(){

    }
}
class Person extends A{
    public String name;
    protected int age;
    String job;
    private double sal;
    public void m1(){

    }
    protected void m2(){

    }
    void m3 (){

    }
    protected void m4(){

    }
}
