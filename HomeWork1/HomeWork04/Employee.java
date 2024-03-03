package HomeWork04;

public class Employee {
    private  String name;
    private double sal;
    public Employee(){

    }

    public Employee(String name, double sal) {
        this.name = name;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
    public void print(){
        System.out.print(" 名字为"+getName()
                +" 工资为"+getSal());
    }

}
