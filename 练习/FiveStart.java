public class FiveStart {
    public static void main(String[] args){

        //输入*
        int i = 0;
        int j = 0;
        int row = 10;

        //计算排数
        for (i = 1; i <= row; i++){
            //打印空格
            for(int k = 1;k <= row-i;k++) {
                System.out.print(" ");
            }
            //打印*
            for (j=1;j <= 2*i - 1 ;j++) {

                 if (j==1||j==2*i-1||i == row) {
                     System.out.print("*");
                 }else {
                     System.out.print(" ");
                 }
                }
            System.out.print('\n');
        }
    }
}
