package HomeWork02;

public class HomeWork01 {
    public static void main(String[] args) {

        Person[] person = new Person[3];
        person[0] = new Person("jack",24,"study");
        person[1] = new Person("dier",25,"sadsa");
        person[2] = new Person("tom",223,"catch");


        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);//输出对象
        }
        System.out.println("========================================");
        //冒泡排序
        for (int i = 0; i < person.length-1; i++) {
            for (int j = 0; j < person.length-1-i; j++) {
                if(person[j].getAge() < person[j+1].getAge()){
                    Person tmp = null;
                    tmp = person[j];
                    person[j] =person[j+1];
                    person[j+1] = tmp;
                }
            }
        }
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);
        }
    }
}
class Person{
public String name;
public int age;
public String job;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    //输出信息
    public  void info(){
        System.out.println(name+"年龄为"+age+"工作是"+job);
    }

}