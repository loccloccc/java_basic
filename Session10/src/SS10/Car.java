package SS10;

public class Car extends Vehicle{
    public Car(String brand) {
        super(brand);
    }

    @Override
    public void move() {
        System.out.println("Di chuyen bang dong co");
    }
}
