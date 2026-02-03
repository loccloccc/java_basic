package SS8;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Student[] arr = new Student[100];
    static int count = 0;

    public static void menu() {
        System.out.println("------------- MENU -----------------");
        System.out.println("1. Nhap danh sach sinh vien");
        System.out.println("2. Hien thi danh sach sinh vien");
        System.out.println("3. Tim sinh vien theo hoc luc");
        System.out.println("4. Sap xep theo diem giam dan");
        System.out.println("5. Thoat");
        System.out.println("------------------------------------");
    }

    public static void inputStudent() {
        System.out.print("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            Student st = new Student();

            System.out.print("Ma SV: ");
            st.setId(sc.nextLine());

            System.out.print("Ten: ");
            st.setName(sc.nextLine());

            System.out.print("Diem: ");
            st.setScore(sc.nextDouble());
            sc.nextLine();

            arr[count++] = st;
        }
    }

    public static void display() {
        for (int i = 0; i < count; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void search(){
        System.out.println("Moi ban nhap hoc luc :");
        String rank = sc.nextLine();
        for (int i = 0; i < count; i++) {
            if (arr[i].getRank().equals(rank)){
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        int choice;
        do {
            menu();
            System.out.print("Lua chon: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    inputStudent();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    search();
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Thoat");
                    break;
                default :
                    System.out.println("Lua chon khong hop le");
            }
        } while (choice != 5);
    }
}
