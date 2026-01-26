package SS2;

import java.util.Scanner;

public class bai3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong sach tra muon :");
        int book = sc.nextInt();
        float money = 0F;
        for (int i = 0 ; i < book ; i++){
            System.out.println("Nhap so ngay tre cua cuon thu : " + (i + 1));
            int lateDay = sc.nextInt();
            money += (5000 * lateDay);
        }
        System.out.println("Tong tien phat : " + money);
    }
}
