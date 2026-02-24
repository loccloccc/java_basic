package BTTH;

public abstract class Drink {
    private int id;
    private String name;
    private double price;

    public Drink(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
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

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double calculatePrice();
    public void displayInfo(){
        System.out.println("Ma do uong : " + id + " . Ten do uong : " + name + " , gia : " + price);
    }
}
