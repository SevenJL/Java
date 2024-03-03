import java.util.Scanner;

public class JudgeNum {
    public static void main(String[] args){
        int i =0 ;
        Scanner num = new Scanner(System.in);
        System.out.println("输入一个数");
        i = num.nextInt();
        if(i == 0){
            System.out.println("等于0");
        }else if(i > 0 ){
            System.out.println("大于0");

        }else {
            System.out.println("小于0");
        }
    }
}
