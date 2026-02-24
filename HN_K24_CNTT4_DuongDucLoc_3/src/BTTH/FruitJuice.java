package BTTH;

public class FruitJuice extends Drink implements IMixable{
    private int discountPercent;// phan tram giam gia

    public FruitJuice(int id, String name, double price, int discountPercent) {
        super(id, name, price);
        this.discountPercent = discountPercent;
    }

    @Override
    public double calculatePrice() {
        if (discountPercent >= 0 && discountPercent <= 100){
            return getPrice() - (getPrice() * discountPercent / 100);
        }else {
            return getPrice();
        }
    }

    @Override
    public void mix() {
        System.out.println("Dang ep ra trai cay tuoi");
    }
}
