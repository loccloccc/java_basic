package BTTH;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BTTH {
    static Scanner sc = new Scanner(System.in);
    static void main(String[] args) {
        String[] MSSV = new String[100];
        int length = 0 ;
        int choice ;


        do {
            menu();
            System.out.println("Lua chon cua ban :");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    renderMSSV(MSSV , length);
                    break;
                case 2:
                    addMSSV(MSSV , length);
                    break;
                case 3:
                    updateMSSV(MSSV);
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Thoat thanh cong");
                    break;
                default:
                    System.out.println("Khong co lua chon nay....");
            }

        }while (choice != 6);

    }
    public static void menu(){
        System.out.println("-----  MENU  ------");
        System.out.println("1 . Hien thi .");
        System.out.println("2 . Them moi .");
        System.out.println("3 . Cap nhat .");
        System.out.println("4 . Xoa .");
        System.out.println("5 . Tim kiem .");
        System.out.println("6 . Thoat");
        System.out.println("--------------------");
    }
    public static void renderMSSV(String[] MSSV , int n){
        if (n == 0 ) {
            System.out.println("Danh sach rong .");
            return;
        }
        for (int i = 0 ; i < MSSV.length ; i++){
            System.out.println("Ma Sinh Vien :" + MSSV[i]);
        }
    }
    public static void addMSSV(String[] arr, int length){
        String studentId;
        do{
            System.out.println("Nhap MSSV (VD: B1234567): ");
            studentId = sc.nextLine();
            if (!studentId.matches("^B\\d{7}$")){
                System.out.println("Khong hop le, yeu cau nhap lai");
            }else {
                arr[length] = studentId;
                System.out.println("Them MSSV thanh cong");
            }
        }while (!studentId.matches("^B\\d{7}$"));
    }
    public  static void updateMSSV(String[] MSSV ){
        int updateID;
        System.out.println("Moi ban nhap vi tri id muon sua :");
        updateID = sc.nextInt();
        sc.nextLine();
        if (updateID < 0 && updateID > MSSV.length) {
            System.out.println("vi tri khong hop le!");
            return;
        }
        String newUpdate;
        for (int i = 0 ; i < MSSV.length ; i++){
            if (i == updateID){
                do {
                    System.out.println("Moi ban nhap ID : ");
                    newUpdate = sc.nextLine();
                    if (!MSSV[i].matches("^B\\d{7}$")){
                        System.out.println("Khong hop le, yeu cau nhap lai");
                    }else {
                        MSSV[i] = newUpdate;
                    }
                }while (!MSSV[i].matches("^B\\d{7}$"));
            }
        }

    }
}
