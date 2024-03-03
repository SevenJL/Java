package HomeWork08;

public class Teacher extends Person{
    private String name;
    private char sex;
    private int age;
    private int work_age;

    public Teacher(String name, char sex, int age, int work_age) {
        super(name,sex,age);
        this.work_age = work_age;
    }

    public void tech(){
        System.out.println("i promise, i will carefully teach");
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }


    public String play() {
        return super.play()+"œÛ∆Â";
    }

//    public void printinfo() {
//        super.printinfo();
//        System.out.println("π§¡‰"+ getWork_age());
//    }
}
