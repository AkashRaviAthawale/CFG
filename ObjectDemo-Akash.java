
class Laptop {
    String model;
    int price;

public boolean equals( Laptop that){
if (this.model.equals(that.model) && this.price == that.price){
return true;
}
else {
return false;
I}
}
}

public class ObjectDemo {

    public static void main(String[] args) {
        Laptop lap = new Laptop();
        lap.model = "HP Elitebook";
        lap.price = 20000;

        Laptop lap1 = new Laptop();
        lap1.model = "HP Elitebook";
        lap1.price = 29999;

        boolean result = lap == lap1;
        boolean result1 = lap.equals(lap1);
        System.out.println(result1);

    }
}
