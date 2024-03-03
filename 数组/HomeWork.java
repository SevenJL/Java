public class HomeWork {
    public static void main(String[] args) {

        A03 a03 =new A03();
        int[] arr1 = {1,2,3,4,5};
        a03.copyArr(arr1);
       //°Ñ
        int[] arr2 = a03.copyArr(arr1);

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(" "+arr2[i]);
        }
    }
}

class A03{
    int[] arr2;
    public int[] copyArr(int[] arr){
        int[] arr2  = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        return  arr2;
    }
}