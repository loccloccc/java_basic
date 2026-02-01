package SS6;

public class Employee {
    private int ma;
    private String ten ;
    private  float luong;

    public Employee() {}

    public Employee(String ten, int ma) {
        this.ten = ten;
        this.ma = ma;
    }

    public Employee(int ma, String ten, float luong) {
        this.ma = ma;
        this.ten = ten;
        this.luong = luong;
    }
    public void render(){
        System.out.println("ma " + this.ma + "Ten : " + this.ten + "luong : " + this.luong);
    }
}
