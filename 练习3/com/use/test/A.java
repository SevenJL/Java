package com.use.test;

public class A {
    //四个属性，分别使用不同的访问修饰符来修饰
    public int n1 =1;
    int n2 = 2;
    protected int n3 = 3;
    private int n4 = 4;

    public void print(){
    //在本类中访问四个属性都可以
        System.out.println(n1+" "+n2+" "+n3+" "+n4);
    }

    protected void m2(){}
    void m3(){}
    private void m4(){}

    //在同一类中，可以访问public protected 默认 private 修饰属性和方法

    public void n1(){
        //在同一类中，可以访问public protected 默认 private 修饰属性和方法
        print();
        m2();
        m3();
        m4();
        Persom DICKER = new Persom("dicker",200);
        System.out.println(DICKER.info());
        //输出为DICKER,200
    }

}
class Persom{
    public String name ;
    private  int age;
    //使用快捷键写出setAge和getAge
    //根据要求完善代码
    //this表示哪一个对象调用就是哪个
    public Persom(){
        //有三个属性的构造器
        this.age=age;
        this.name=name;
    }
    public Persom(String name,int age){
        setName(name);
        setAge(age);
        //将set方法写在构造器中，这样仍然可以验证
    }
    public void setAge(int age) {
        if (age >= 1 && age <= 120){
            this.age = age;
        }else {
            System.out.println("error");
            this.age = 18;
            //给一个默认值
        }
    }

    public int getAge() {
        return age;
    }
    public void setName(String name) {
        //判断数据的准确
        if(name.length() >=2 && name.length()<=6) {
            this.name = name;
        }else{
            this.name ="XXX";
            System.out.println("name is error");
            //相当于增加业务逻辑
        }
    }

    public String getName() {
        return name;
    }
    public  String info(){
        return "信息为name="+name+"  age"+age;
    }
}
