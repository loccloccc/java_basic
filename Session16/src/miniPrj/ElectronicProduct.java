package miniPrj;

public class ElectronicProduct extends Product{

    private int warrantyMonths;

    public ElectronicProduct(String ep1, String mayTinh, int warrantyMonths) {
        this.warrantyMonths = warrantyMonths;
    }

    public ElectronicProduct(String id, String name, double price, int warrantyMonths) {
        super(id, name, price);
        this.warrantyMonths = warrantyMonths;
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    public void setWarrantyMonths(int warrantyMonths) {
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public double calculateFinalPrice() {
        if (warrantyMonths >12) return getPrice() + 1000000;
        return getPrice();
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("So thang bao hanh san pham : " + warrantyMonths);
    }
}
