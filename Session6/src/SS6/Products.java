package SS6;

public class Products {
    private int IdP;
    private String nameP;
    private float price;

    public Products(int idP, String nameP, float price) {
        this.IdP = idP;
        this.nameP = nameP;
        setPrice(price);
    }

    public int getIdP() {
        return IdP;
    }

    public void setIdP(int idP) {
        IdP = idP;
    }

    public String getNameP() {
        return nameP;
    }

    public void setNameP(String nameP) {
        this.nameP = nameP;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if (price > 0f){
            this.price = price;
        }else {
            System.out.println("loi");
        }
    }

    public void render(){
        System.out.println("Ma SP : " + this.IdP + "Ten : " + this.nameP + "Gia : " + this.price);
    }
}
