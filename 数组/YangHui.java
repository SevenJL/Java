public class YangHui {
    public static void main(String[] args) {
        //定义一个二维数组
        int[][] arr1=new int[10][];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = new int[i+1];

            for (int j = 0; j < arr1[i].length; j++) {
                if (j == 0 || j ==arr1[i].length-1) {
                    arr1[i][j] = 1;
                } else{
                     arr1[i][j] =arr1[i-1][j]+arr1[i-1][j-1];
                }
            }

        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) System.out.print(arr1[i][j] + " ");
            System.out.println();
        }
    }
}
