package com.use.PKG;

import com.use.test.A;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.n1);
        //只有public的修饰的，才能在不同包下访问修饰符访问或方法
        //不能访问protected，默认，private的

        a.print();


        //只能访问一个修饰符修饰的
    }
}
