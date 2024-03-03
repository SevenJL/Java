public class BreakExercise {
    static String s1= "hi!";
    public static void main(String[] args){
        int i ;
        int sum = 0;
        int n = 0;
        for(i = 1; i <=100;i++){
            sum+=i;
            if(sum >= 20){
                n = sum;
                break;
            }
        }
        System.out.println(sum);
        System.out.println(n);
    }
}
