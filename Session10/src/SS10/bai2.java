package SS10;

public class bai2 {
    static void main(String[] args) {
        Vehicle vehicle1 = new Car("Toyota");
        Vehicle vehicle2 = new Bicycle("Duc Thang");
        System.out.print("ten hang : " + vehicle1.getBrand() + " - Cach di chuyen : ");
        vehicle1.move();
        System.out.println();
        System.out.print("ten hang : " + vehicle2.getBrand() + " - Cach di chuyen : ");
        vehicle2.move();
    }
}
