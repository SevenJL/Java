public class object {
public static void main(String[] args) {

Cat cat1 = new Cat(); //创建一只猫的属性
cat1.name = "白";
cat1.age = 13;
cat1.color = "white";

//访问对象的属性
System.out.println("第一只猫"+cat1.name+" "+cat1.age+" "+cat1.color);

}
}
class Cat {//创建一个猫类
String name;
int age;
String color;
}