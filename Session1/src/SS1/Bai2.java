package SS1;

import java.util.Scanner;

public class Bai2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số ngày chậm trễ :");
        int n = sc.nextInt();
        System.out.print("Nhập số lượng sách mượn");
        int m = sc.nextInt();


        double total = n * m * 5000;
        System.out.println("Tiền phạt gốc : " + total);
        if (n>7 && m >= 3){
            double total2 = total * 1.2;
            System.out.println("Tiền phạt sau dieu chinh : " + total2);
            if (total2 > 50000){
                System.out.println("Yeu cau khoa the : true");
            }else {
                System.out.println("Yeu cau khoa the : False");
            }
        }else{
            System.out.println("Tiền phạt sau dieu chinh : " + total);
            System.out.println("Yeu cau khoa the : False");
        }
    }
}
