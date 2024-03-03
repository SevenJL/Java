public class NumDivide {
    public static void main(String[] args){
        double sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum +((i%2)-0.5)*2*(1.0/i);
        }
        System.out.println(sum);
    }
}
