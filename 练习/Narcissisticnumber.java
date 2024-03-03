import java.util.Scanner;

public class Narcissisticnumber {
    public static void main(String[] args){
        int num ;
        Scanner Narcissistic_number = new Scanner(System.in);
        System.out.println("num:");
        num = Narcissistic_number.nextInt();

        int num1,num2,num3;
        num1 = num % 10;//个位
        num2 = (num/10) % 10;//十位
        num3 = (num/100) % 10;//百位

        if (num == num1*num1*num1+num2*num2*num2+num3*num3*num3) {
            System.out.println("是水仙花数");
        }
        else{
            System.out.println("不是水仙花数");
            }
        }
}

