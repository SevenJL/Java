package com.use.test;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        a.print();
        //1 2 3 4
        B b = new B();
        b.print2();
        //1 2 3
        Persom persom = new Persom();
        persom.setName("dicker");
        persom.setAge(3000);
        System.out.println(persom.info());

    }
    //类只有默认和public才可以修饰类

}

//protected class print2(){}
//报错
//类只有默认和public才可以修饰类