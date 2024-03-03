public class HanNuoTa {
    public static void main(String[] args) {


        Tower tower =new Tower();
        tower.move(20,'A','B','C');
    }
}
class Tower {
    int n = 0;
    //方法
    //num是移动的几个盘子，abc表示塔
    public void move(int num,char a,char b, char c){
        //如果只有一个盘
        if (num == 1) {
            System.out.println(a+"->"+c);
        }else {//如果有多个盘可以看作俩个盘字

            //先移动上面所以盘到b，借助c来移动
            move(num-1,a,c,b);
            //num-1下面一个，最上面num-1个盘
            //移动a所用盘借助c到b

            //把下面这个盘移动到c
            System.out.println(a + "->" + c);
            n++;
            System.out.print(n);
            //再把b塔所以的盘移动到c，借助a塔
            move(num-1,b,a,c);
            //把b所以的盘移动到c，借助a
        }

    }

}