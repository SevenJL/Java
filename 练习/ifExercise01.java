import java.util.Scanner;
public class ifExercise01 {
        public  static  void  main(String[] args){
//            double a,b;
//            Scanner myScanner = new Scanner (System.in);
//            //创建scanner对象
//            System.out.println("输入a");
//             a =myScanner.nextDouble();
//            System.out.println("输入b");
//             b =myScanner.nextDouble();
//            if(a>10.0 && b<20.0) {
//                System.out.println("俩数之和为" + (a+b));
//            }
//            else{
//                System.out.println("错误");
            // }

//            int a = 0;
//            int b = 0;
//            Scanner myScanner =new Scanner(System.in);
//            //创建scanner变量
//            System.out.println("输入a");
//            a = myScanner.nextInt();
//            System.out.println("输入b");
//            b = myScanner.nextInt();
//
//            if((a+b)%3 == 0 && (a+b)%5 == 0){
//                System.out.println("可以被3,5整除");
//            }
//            else{
//                System.out.println("不能被3,5同时整除");
//            String c = "hello";
//            switch (c){
//                case "hi":
//                    break;
//
//                case "hello":
//                    break;
//
//                default:
//                    break;
//
//            }
                    Scanner scanner = new Scanner(System.in);

                    System.out.println("请输入一个小写字母：");
                    String input = scanner.nextLine();

                    if (input.length() == 1 && Character.isLowerCase(input.charAt(0))) {
                        String output = input.toUpperCase();

                        System.out.println("对应的大写字母是：" + output);
                    }
                    else {
                        System.out.println("输入不合法，请输入一个小写字母！");
                    }
                }
            }




