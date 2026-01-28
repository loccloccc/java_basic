package SS4;

public class bai2 {
    static void main(String[] args) {
        String description = "Sach giao khoa toan lop 12 , Ke : A1-102 , tinh trang moi";
        int check = description.indexOf("Ke");
        if(check!= -1){
            description =  description.replace("Ke","Vi tri luu tru");
            System.out.println(description);
        }
    }
}
