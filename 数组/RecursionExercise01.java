public class RecursionExercise01 {
    public static void main(String[] args) {
     //����һ������
        A a1 = new A();
        System.out.println(a1.Recursion(7));
    }
}

class  A{
//����һ������
    public int Recursion(int n) {
        if (n >= 1) {
            if (n == 2 || n == 1) {
                return 1;
            } else{
                return Recursion(n - 1) + Recursion(n - 2);
            }
        }else{
            System.out.println("error!");
            return -1;
        }
    }

}
