public class MemberInnerClass {
//    public static void main(String[] args){
//        Outer outer = new Outer();
//
//        //外部其他类，使用成员内部类的三种方式
//        Outer.Inner inner = outer.new Inner();
//        //Outer.new Inner(); 相当于把 new Inner()当做是outer成员
//
//        //在外部类中，编写一个方法，返回Inner对象
//        Outer.Inner innerInstance = outer.getInnerInstance();
//        innerInstance.say();
//    }


    public static void main(String[] args){
        Outer.Inner inner = new Outer.Inner();
        inner.say();
    }
}
class Outer{
    public static class Inner{
        public void say(){
            System.out.println("111 ");
        }
    }
}