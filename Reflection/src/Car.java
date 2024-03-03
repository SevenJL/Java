public class Car {
    public String brand ="BWM";
    public int price= 5000000;
    public String color = "BLACK";

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
