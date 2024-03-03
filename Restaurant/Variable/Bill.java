package Variable;

public class Bill {
    private int id;
    private String uuid;
    private String food;
    private double totalPrice;
    private String time;


    public Bill(int id, String uuid, String food, double totalPrice, String time) {

        this.id = id;
        this.uuid = uuid;
        this.food = food;
        this.totalPrice = totalPrice;
        this.time = time;
    }
    @Override
    public String toString() {
        return "ID=" + id +
                "\t UUID=" + uuid +
                "\t\t 菜系={" + food + "}" +
                "\t\t 总价格=" + totalPrice +
                "\t\t 时间=" + time;
    }
    public String getUUID() {
        return uuid;
    }
}
