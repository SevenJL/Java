public class ChildGame {
    public static void main(String[] args) {
        int count = 0;

        Child child1 = new Child("dicker");
        child1.join();
        child1.count++;

        Child child2 = new Child("joker");
        child2.join();
        child2.count++;

        //类变量，可以通过类名来访问
        System.out.println("共有"+Child.count + "小孩加入了游戏.......");

        System.out.println("child1.count="+child1.count);
        System.out.println("child2.count="+child2.count);
    }
}

class Child{
    //类
    private String name;
    //定义一个变量count，是一个类变量（静态变量）static 静态
    //该变量的最大特点就是被Child 类所有的对象实例共享
    public static int count = 0;
    public Child(String name){
        this.name =name;

    }
    public void join(){
        System.out.println(name + " 加入了游戏.....");
    }
}
