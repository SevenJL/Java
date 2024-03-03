public class HomeWork05 {
    public static void main(String[] args) {

        Cale cale =new Cale(4,2);
        cale.div();
        cale.mul();
        cale.minus();
        cale.sum();
        System.out.println(cale.mul());
        System.out.println(cale.sum());
        System.out.println(cale.div());
        System.out.println(cale.minus());

    }
}

class Cale{
    //创建变量
    double num1;
    double num2;
    //创建构造器


    public Cale(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    //求和
    public double sum(){
        return num1+num2;

    }
    //差
    public double minus(){
        return  num1 -num2;
    }
    //乘
    public double mul(){
        return num1*num2;
    }
    public Double div(){
        if(num2 == 0){
            System.out.println("不能为0");
            Double o = null;
            return o;
        }else return num1 / num2;
    }
}