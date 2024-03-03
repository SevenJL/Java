package HomeWork07;

public class Test {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("jack",22,"doctor","男",4000);
        Doctor doctor2 = new Doctor("jackr",22,"doctor","男",4000);

        System.out.println(doctor1.equals(doctor2));
    }
}

class Person{
    public void run(){}
    public void ear(){}

}
class Student extends Person{
    public void run(){}
    public void study(){}
}
//向上转型：父类的引用指向子类对象
//Person p = new Student();
//因为编译类型是Person，所以调用方法时只能调用父类的方法
//而不能调用子类的，例如：p.study();这就是错的
//p.run();//运行类型是子类，所以运行时是从子类开始找，所以运行的是子类的run方法
//p.eat();//子类没有eat，由于子类继承了父类，所以去找父类的方法，也就是运行是父类的eat
//向下转型：把指向子类对象的父类引用，转成指向子类对象的子类引用
//Student s = (Student) p;
//s.run();//编译类型和运行类型都为子类，所以编译时，看子类有哪些方法和父类的哪些方法
//s.study();
//s.eat();//person eat // 子类没有eat，编译和运行都是父类的，子类继承了父类的
