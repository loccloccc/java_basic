package SS1;

import java.util.Scanner;

public class Bai1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma sach :");
        String bookId = sc.nextLine();
        System.out.println("Nhap ten sach :");
        String bookName = sc.nextLine();
        System.out.println("Nhap nam san xuat :");
        int publishYear = sc.nextInt();
        System.out.println("Nhap gia bia :");
        double price = sc.nextDouble();
        System.out.println("Sach con trong kho (true/false):");
        boolean isAvailable = sc.nextBoolean();

        int bookLifespan = 2026 - publishYear;

        System.out.println("--- Phieu thong tin sach ---");
        System.out.println("Ten sach : " + bookName);
        System.out.println("Ma so : " + bookId + "| Tuoi tho " + bookLifespan + " nam");
        System.out.println("Gia ban : " + price + "VND");
        if (isAvailable = true) System.out.println("Tinh trang : Con sach");
        else System.out.println("Tinh trang : Het sach");
    }
}
