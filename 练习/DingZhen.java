import java.util.Scanner;

public class DingZhen {
    public static void main(String[] args){
        Scanner people = new Scanner(System.in);

        int chance = 3;

        for (int i = 0; i < 3; i++) {
            System.out.println("name");
            String name = people.next();
            System.out.println("passwords");
            String Passwords = people.next();

            if ("dicker".equals(name) && "666".equals(Passwords)) {
                    System.out.println("congratulations!");
                    break;
            }
            chance--;
            System.out.println("错误"+"还有"+chance+"次机会");
        }

    }
}
