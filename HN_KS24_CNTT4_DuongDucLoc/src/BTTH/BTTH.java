package BTTH;

import java.util.Scanner;

public class BTTH {
    static Scanner sc = new Scanner(System.in);

     static void main(String[] args) {
        String[] MSSV = new String[100];
        int length = 0;
        int choice;

        do {
            menu();
            System.out.print("Lua chon cua ban: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    renderMSSV(MSSV, length);
                    break;
                case 2:
                    length = addMSSV(MSSV, length);
                    break;
                case 3:
                    updateMSSV(MSSV, length);
                    break;
                case 4 :
                    length = deleteMSSV(MSSV,length);
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Thoat thanh cong");
                    break;
                default:
                    System.out.println("Khong co lua chon nay...");
            }
        } while (choice != 6);
    }

    public static void menu() {
        System.out.println("----- MENU -----");
        System.out.println("1. Hien thi");
        System.out.println("2. Them moi");
        System.out.println("3. Cap nhat");
        System.out.println("4. Xoa");
        System.out.println("5. Tim kiem");
        System.out.println("6. Thoat");
        System.out.println("----------------");
    }


    public static void renderMSSV(String[] MSSV, int length) {
        if (length == 0) {
            System.out.println("Danh sach rong.");
            return;
        }
        for (int i = 0; i < length; i++) {
            System.out.println("[" + i + "] Ma Sinh Vien: " + MSSV[i]);
        }
    }


    public static int addMSSV(String[] arr, int length) {
        String studentId;
        do {
            System.out.print("Nhap MSSV (VD: B1234567): ");
            studentId = sc.nextLine();
            if (!studentId.matches("^B\\d{7}$")) {
                System.out.println("Khong hop le, yeu cau nhap lai");
            }
        } while (!studentId.matches("^B\\d{7}$"));

        arr[length] = studentId;
        System.out.println("Them MSSV thanh cong");
        return length + 1;
    }


    public static void updateMSSV(String[] MSSV, int length) {
        if (length == 0) {
            System.out.println("Danh sach rong, khong the cap nhat");
            return;
        }

        System.out.print("Nhap vi tri can sua: ");
        int updateID = sc.nextInt();
        sc.nextLine();

        if (updateID < 0 || updateID >= length) {
            System.out.println("Vi tri khong hop le!");
            return;
        }

        String newUpdate;
        do {
            System.out.print("Nhap MSSV moi: ");
            newUpdate = sc.nextLine();
            if (!newUpdate.matches("^B\\d{7}$")) {
                System.out.println("Khong hop le, yeu cau nhap lai");
            }
        } while (!newUpdate.matches("^B\\d{7}$"));

        MSSV[updateID] = newUpdate;
        System.out.println("Cap nhat thanh cong");
    }

    public static  int deleteMSSV(String[] MSSV , int length){
        System.out.println("Nhap Ma sinh vien muon xoa :");
         String deleteMSSV = sc.nextLine();
         int index = 0;
         for (int i = 0 ; i < MSSV.length ; i++){
             if (MSSV[i].equals(deleteMSSV)){
                 index = i;
                 break;
             }
         }
         for (int i = index ; i < length - 1; i++){
             MSSV[i] = MSSV[i+1];
         }
         MSSV[length-1] = null;
         length--;
        System.out.println("Xoa thanh cong");
        return  length;
    }
}
