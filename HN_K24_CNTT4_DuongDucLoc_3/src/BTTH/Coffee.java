package BTTH;

public class Coffee extends Drink{
    private boolean hasMilk; // xac dinh co sua hay khong

    public Coffee(int id, String name, double price, boolean hasMilk) {
        super(id, name, price);
        this.hasMilk = hasMilk;
    }

    @Override
    public double calculatePrice() {
        if (hasMilk == true){
            return getPrice() + 5000;
        }
        return  getPrice();
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        if (hasMilk == true) System.out.println("co sua");
        else System.out.println("khong sua");
    }
}
