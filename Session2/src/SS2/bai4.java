package SS2;

import java.util.Scanner;

public class bai4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id ;
        do {
            System.out.println("Nhap ma id sach moi (phai lon hon 0) : ");
            id = sc.nextInt();
            System.out.println("Loai : ID phai la so duong . Moi ban  nhap lai.");
        }while (id <= 0);
        System.out.println("Lưu mã sách thành công.");
    }
}
