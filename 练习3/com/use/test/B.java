package com.use.test;

public class B {
    public void print2(){
        A a = new A();
        //��ͬһ�����£����Է���public��protected �� Ĭ�ϵ�
        //���ܷ���˽�е�����/����
        System.out.println(a.n1+" "+a.n2+" "+a.n3);
        //a.n4��˽�еģ���������һ�������з���
        a.print();
        a.m2();
        a.m3();
        //ֻ�ܷ�������������ε�
    }

}
