public class innerclass01 {
    public static void main(String[] args) {

    }
    class Outer{
        //�����
        {
            System.out.println("�����");
        }
        private static int x = 1;
        class Inner{
            //�ڲ���

        }
        Inner inner = new Inner();
        class Inner2 extends Inner{

        }
    }
}
