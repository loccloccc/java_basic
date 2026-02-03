package SS8;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void menu(){
        System.out.println("------------- MENU -----------------");
        System.out.println("1 . Nhap danh sach sinh vien.");
        System.out.println("2 . Hien thi danh sach sinh vien .");
        System.out.println("3 . Tim kiem sinh vien theo Hoc luc.");
        System.out.println("4 . Sap xep theo hoc luc giam dan.");
        System.out.println("5 . Thoat.");
        System.out.println("--------------------------------------");
    }
    String[] arr = new String[100];
    public void inputStudent(String[] arr){
        System.out.println("nhap so luong sinh vien muon them :");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0 ; i < n ; i++){

        }
    }
    static void main(String[] args) {
        int choice;
        do {
            menu();
            System.out.println("Lua chon cua ban : ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1 :
                    break;
                case 2:
                    break;
                case 3 :
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Thoat");
                    break;
                default:
                    System.out.println("Lua chon khong hop le");
            }
        }while (choice!=5);
    }
}
