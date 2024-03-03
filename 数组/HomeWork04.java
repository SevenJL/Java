public class HomeWork04 {
    public static void main(String[] args) {

        //创建方法
        Circle circle = new Circle(4.0);
        //求面积
        circle.area();
        //求周长
        circle.len();
    }
}

class  Circle {
    //构造器
    double radius;
    public Circle(double radius){
        this.radius = radius;
        //谁调用这个radius就是谁的
    }

    //半径为radius
    //周长为length
    public void len() {
        //提供半径，显示周长
        //周长的2πr
        //Math.Pi是π的值，非常接近π
        double l = 2 * radius * Math.PI;
        System.out.println("周长=" + l);
    }
    //面积为area
     public void area(){
        //显示面积
        //面积等于πr的平方
        double s = Math.PI*radius*radius;
        System.out.println("面积="+s);
    }
}