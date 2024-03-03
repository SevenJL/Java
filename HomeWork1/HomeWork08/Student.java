package HomeWork08;

public class Student extends Person{
    private String name;
    private  char sex;
    private int age;
    private String stu_id;
    public Student(String name, char sex, int age, String stu_id) {
       super(name,sex,age);
        this.stu_id = stu_id;
    }

    public void study(){
        System.out.println("i promise, i will really study");
    }


    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    @Override
    public String play() {
        return super.play()+"×ãÇò";
    }


    public void printinfo() {

        System.out.println("Ñ§ºÅ"+getStu_id());
    }
}
