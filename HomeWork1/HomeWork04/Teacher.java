package HomeWork04;

public class Teacher extends Worker{
    private double classBonus;
    

    public Teacher(double classBonus) {
        this.classBonus = classBonus;
    }

    public double getClassBonus() {
        return classBonus;
    }

    public void setClassBonus(double classBonus) {
        this.classBonus = classBonus;
    }

    @Override
    public void print() {
        super.print();
        System.out.print(" ¿Î³êÎª"+getClassBonus());
    }
}
