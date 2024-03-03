public class MonkeyEat {
    public static void main(String[] args) {
        //有n个桃子，第10天
        //第一天：i=(n/2)+1个桃子
        //第二天：吃（i/2)+1个桃子
        //....
        //第十天：还没吃 就剩一个桃子

        eatTaoZi a = new eatTaoZi();
        int ret = a.MonkeyEatTiaoZi(1);
        System.out.println(ret);

    }

}
class eatTaoZi{
    public int MonkeyEatTiaoZi(int day){
        if(day == 10){
            return 1;
        }else if (day>=1 && day<=9){
            return (MonkeyEatTiaoZi(day+1)+1)*2;
        }else{
            return  -1 ;
        }
    }

}