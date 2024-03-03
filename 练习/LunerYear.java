import java.util.Scanner;

public class LunerYear {
    public static void main(String[] asgs) {
        int year = 0;
        Scanner lunYear = new Scanner(System.in);
        System.out.println("输入年份");
        year = lunYear.nextInt();

        if (year % 4 == 0 && year % 400 != 0) {
            System.out.println("是闰年！");
        } else if (year % 400 == 0) {
                System.out.println("是世纪闰年");
        } else {
                   System.out.println("不是闰年");
        }
    }
}

