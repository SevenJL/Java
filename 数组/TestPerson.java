public class TestPerson {
    public static void main(String[] args) {

          Person01 p1 = new Person01("DICK",20);
          Person01 p2 = new Person01("DICK",20);

          System.out.println("结果"+ p1.compareTo(p2));
          //用的是p1.compareTo()，所以这个this.name指定就是p1中的name和age
        //传的是p2，p2引用的name和age就是DICKER和21
    }
}

class Person01 {
    String name;
    int age;
    public Person01(String name,int age){
        this.name = name;
        this.age = age;
    }

    public boolean compareTo(Person01 p){
      return (this.name.equals(p.name) && this.age == p.age);
      //判断表示式返回值就是boolean类型的
    }
}