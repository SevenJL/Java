import java.util.Random;

public class HomeWork6 {
    public static void main(String[] args) {
        int[] arr =new int[10];
        //(int)(Math.random()*100)+1随机生成1-100数字
        for (int i = 0; i < arr.length; i++) {
            arr[i] =(int)(Math.random()*100)+1;
            //遍历每个数组，使每个数组的元素都为随机数
        }

        //正序打印
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " +arr[i]);
        }
        System.out.println();

        //逆序打印
        for (int i = arr.length-1; i >= 0 ; i--) {
            System.out.print(" "+arr[i]);
        }

        //平均值
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("\n " +sum/ arr.length);

        //求最大值
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max< arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);

        int num = 8;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 8){
                System.out.println("有8");
            }
        }
    }


}
