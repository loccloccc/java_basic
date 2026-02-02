package SS7;

public class bai4 {
    static void main(String[] args) {
        ClassRoom cr1 , cr2 ;
        cr1 = new ClassRoom("loc");
        cr2 = new ClassRoom("duy");

        cr1.PayTheMoney(1000000);
        cr2.PayTheMoney(500000);

        ClassRoom.total();
    }
}
