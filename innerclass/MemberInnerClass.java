public class MemberInnerClass {
//    public static void main(String[] args){
//        Outer outer = new Outer();
//
//        //�ⲿ�����࣬ʹ�ó�Ա�ڲ�������ַ�ʽ
//        Outer.Inner inner = outer.new Inner();
//        //Outer.new Inner(); �൱�ڰ� new Inner()������outer��Ա
//
//        //���ⲿ���У���дһ������������Inner����
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