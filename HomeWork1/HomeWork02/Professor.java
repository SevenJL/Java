package HomeWork02;

public class Professor extends Teacher {
    private double specialSalary;

    public Professor(String name, int age, String post, double salary, double specialSalary) {
        super(name, age, post, salary);
        this.specialSalary = specialSalary;
    }

    public double getSpecialSalary() {
        return specialSalary;
    }

    public void setSpecialSalary(double specialSalary) {
        this.specialSalary = specialSalary;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.print(" 工资级别为"+getSpecialSalary());
    }
}
