public class OverLoadExercise {
    public static void main(String[] args) {

        Methods method = new Methods();
        method.m(10);
        method.m("ABC");
        method.m(1,2 );
        Methods2 methods2 = new Methods2();
        methods2.m2(1,2);
    }
}

class Methods{

    public void m (int n){
        System.out.println("平方"+ (n*n));
    }


    //相乘
    public void m (int n1,int n2){
        System.out.println("相乘"+ (n1*n2));
    }

    public void m (String str){
        System.out.println("String= "+ str);
    }
}

class Methods2{
    public int m2 (int n1,int n2){
        if (n1 >= n2){
            return n1;
        }else if (n2 > n1){
            return n2;
        }else{
            return -1;
        }
    }

    public double m2 (double n1,double n2){
        if (n1 >= n2){
            return n1;
        }else if (n2 > n1){
            return n2;
        }else{
            return -1;
        }
    }

    public double m2 (double n1,double n2,double n3){
        if (n1 >=n2){
            if (n1>n3){
                return n1;
            }else{
                return n3;
            }
        } else if (n1 < n2) {
            if (n2 >= n3) {
                return n2;
            }else {
                return n3;
            }        }else{
            return -1;
        }
    }
}