public class Constructor {
    public static void main(String[] args) {

        Person p1 =new Person();//无参构造器

        System.out.println("name =" + p1.name + "age = " +p1.age);
        //输出NULL和18
        Person p2 = new Person("scott" ,50);

        System.out.println("name ="+ p2.name + "age =" + p2.age);
        //输出scott和50
    }
}

class Person{
    String name;//默认为NULL
    int age;//默认为0
    //第一个构造器，将所有人的年龄设置为18
    public Person(){
        age =18;
    }
    //第二个构造器的pName和pAge
    public Person(String pName,int pAge){
        name = pName;
        age = pAge;
    }
}
