enum Laptops {

    Hp(2000), MackBook(), Thinkpad(5000), Dell(6000);

    private int price;

    private Laptops() {
        price = 5000;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private Laptops(int price) {
        this.price = price;
    }
}

public class EnumDemoExample {

    public static void main(String[] args) {

        for (Laptops lap : Laptops.values()) {
            System.out.println(lap + ": " + lap.getPrice());
        }

    }

}
