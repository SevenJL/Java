public class Sequence {
    public static void main(String[] args){
        int sum = 0;
        for (int j = 1; j <=100 ; j++) {
            for (int i = 1; i <= j; i++) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
