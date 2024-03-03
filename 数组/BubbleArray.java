public class BubbleArray {
    public static void main(String[] args){
        int[] arr1 = {24,69,80,57,13};
        //创建数组

        for(int j = 0; j< arr1.length-1;j++){
            //多轮排序用for循环

            //实现一次冒泡排序
            for (int i = 0; i < arr1.length - 1; i++) {
                //前面的数大于后面的数就交换
                if (arr1[i] > arr1[i + 1]) {
                    int tmp = 0;//辅助交换
                    tmp = arr1[i];
                    arr1[i] = arr1[i + 1];
                    arr1[i + 1] = tmp;
                    //排序一次
                }
            }
        }
        //输出arr1数组的各个元素
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(" " + arr1[i]+"\t");
        }
    }
}
