package com.use.test;

public class B {
    public void print2(){
        A a = new A();
        //在同一个包下，可以访问public，protected 和 默认的
        //不能访问私有的属性/方法
        System.out.println(a.n1+" "+a.n2+" "+a.n3);
        //a.n4是私有的，不能再另一个包类中访问
        a.print();
        a.m2();
        a.m3();
        //只能方法这个三种修饰的
    }

}
