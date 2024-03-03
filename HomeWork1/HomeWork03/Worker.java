package HomeWork03;

public class Worker {
    private String name;
    private double datSalary;
    private int day;
    private double garde;
    public Worker(){

    }

    public Worker(String name, double datSalary, int day, double garde) {
        this.name = name;
        this.datSalary = datSalary;
        this.day = day;
        this.garde = garde;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDatSalary() {
        return datSalary;
    }

    public void setDatSalary(double datSalary) {
        this.datSalary = datSalary;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public double getGarde() {
        return garde;
    }

    public void setGarde(double garde) {
        this.garde = garde;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", datSalary=" + datSalary +
                ", day=" + day +
                ", garde=" + garde +
                '}';
    }

    public void print(){
        System.out.println(getName());
        System.out.println(getDay());
        System.out.println(getDatSalary()*getDay()*getGarde());
    }
}
