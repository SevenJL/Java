package HomeWork03;

public class CommenWorker extends Worker{
    public void print(){
        System.out.println(getName());
        System.out.println(getDay());
        System.out.println(getDatSalary()*getDay()*getGarde());
    }
}
