package SS10;

public class bai1 {
    static void main(String[] args) {
        Circle c = new Circle(10);
        Rectangle r = new Rectangle(10,20);
        System.out.printf("Chu vi hinh tron : %.2f \n" , c.getPerimeter());
        System.out.printf("Dien tich hinh tron : %.2f \n" , c.getArea());

        System.out.printf("Chi vi hinh chu nhat : %.2f \n", r.getPerimeter());
        System.out.printf("Dien tich hinh chu nhat : %.2f \n" , r.getArea());
    }
}
