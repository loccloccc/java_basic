package SS7;

public class ClassRoom {
    private static double classFund = 0 ;
    private String name;

    public ClassRoom(String name) {
        this.name = name;
        classFund++;
    }

    public void PayTheMoney(double money){
       if (money > 0){
           classFund+=money;
           System.out.println("SV " + name + " dong " + money);
       }else{
           System.out.println("so tien khong hop le");
       }
    }
    public static void total(){
        System.out.println("tong : " + classFund);
    }
}
