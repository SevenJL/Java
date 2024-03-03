public class innerclass01 {
    public static void main(String[] args) {

    }
    class Outer{
        //代码块
        {
            System.out.println("代码块");
        }
        private static int x = 1;
        class Inner{
            //内部类

        }
        Inner inner = new Inner();
        class Inner2 extends Inner{

        }
    }
}
