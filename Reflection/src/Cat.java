import java.io.Serializable;

public class Cat implements Serializable {

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private static String name = "TOM";
    public int age = 10;
    public void hi(){
        System.out.println("hi");
    }
    private static void cry(){
        System.out.println("~~~");
    }
    public Cat(){}
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }
}
