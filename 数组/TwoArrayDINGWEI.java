public class TwoArrayDINGWEI {
    public static void main(String[] args) {
        //定义原数组
        int[] arr= {10,46,34,89,65};
        int insertNum = 38;
        int index = -1;//定位，如果没有搜索到位置，说明是最大的，位置应该在在最后一个

        for (int i = 0; i < arr.length; i++) {
            if (insertNum <= arr[i]) {
                index = i;//找到位置，记录位置
                break;//跳出for语句
            }
        }
        if (index == -1){//没有找到相应位置，说明是最后一个位置
            insertNum = arr.length;
        }

        //扩容
        int[] arrNew = new int [arr.length+1];//对每个一维数组进行开空间
        for (int i = 0,j=0; i < arrNew.length; i++) {
            if (i!=index) {
                arrNew[i] = arr[j];//拷贝
                j++;
            }else {
                arrNew[i] = insertNum;//添加要添加的数值
            }
        }
        arr = arrNew;//销毁原来的数组
        System.out.println("==========");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");//输出二维数组的每一个元素
        }
    }
}
