package Variable;

public class Dish {
    private int id;
    private String name;
    private double price;
    private String describe;

    private int number;

    public Dish(int id, String name, double price, String describe, int number) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.describe = describe;
        this.number = number;
    }

    @Override
    public String toString() {
        return "ID：" + id +
                "\t\t\t菜系：" + name +
                "\t\t价格：" + price +
                "\t\t\t描述：" + describe +
                "\t库存： " + number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
