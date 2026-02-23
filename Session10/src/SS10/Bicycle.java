package SS10;

public class Bicycle extends Vehicle {
    public Bicycle(String brand) {
        super(brand);
    }
    @Override
    public void move() {
        System.out.println("Di chuyen bang suc nguoi");
    }
}
