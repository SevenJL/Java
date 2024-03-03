public class Homework01 {
    public static void main(String[] args) {

        double[] arr = {1.0, 9.0, 7.6, 7.7, 9.9};
        A01 a01 = new A01();
        Double res = a01.max(arr);
        if (res != null) {
            System.out.println(res);
        } else {
            System.out.println("输入有误 ");
        }
    }
}

class A01{
    public Double max (double[] arr) {

        //返回一个对象Double
        if (arr.length > 0) {
            double max1 = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (max1 < arr[i]) {
                    max1 = arr[i];
                }
            }
            return max1;
        }else{
            return  null;
        }
    }
}
