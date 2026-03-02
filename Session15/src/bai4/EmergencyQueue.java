package bai4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EmergencyQueue {
    public static  Queue<EmergencyPatient> emergencyPatients = new LinkedList<>();//cap cuu
    public static  Queue<EmergencyPatient> normalQueue = new LinkedList<>();// thuong
    static Scanner sc = new Scanner(System.in);
    static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Them benh nhan");
            System.out.println("2. Goi benh nhan tiep theo");
            System.out.println("3. Hien thi danh sach");
            System.out.println("4. Thoat");
            System.out.print("Lua chon cua ban: ");

            choice = sc.nextInt();
            sc.nextLine(); // tránh lỗi nuốt dòng
            switch (choice){
                case 1:
                    EmergencyPatient emergencyPatient = new EmergencyPatient();
                    addPatient(emergencyPatient);
                    break;
                case 2:
                    EmergencyPatient emergencyPatient1 = new EmergencyPatient();
                    emergencyPatient1 = callNextPatient();
                    if (emergencyPatient1 == null) System.out.println("Danh sach rong");
                    System.out.println( "dang goi " +  emergencyPatient1);
                    break;
                case 3:
                    displayQueue();
                    break;
                case 4:
                    System.out.println("Thoat chuong trinh");
                    break;
                default:
                    System.out.println("Khong co lua chon nao");
            }

        }while (choice!=4);
    }

    public static void addPatient(EmergencyPatient p){
        System.out.println("Nhap ma benh nhan :");
        p.setId(sc.nextLine());
        System.out.println("Nhap ten benh nhan :");
        p.setName(sc.nextLine());
        System.out.println("Nhap muc do uu tien (1 : uu tien cao / 2 : uu tien thap : ");
        p.setPriority(sc.nextInt());
        sc.nextLine();
        if (p.getPriority() == 1){
            emergencyPatients.add(p);
        }else normalQueue.add(p);

        System.out.println("Them benh nhan thanh cong");
    }

    public static EmergencyPatient callNextPatient(){
        if (!emergencyPatients.isEmpty()) return emergencyPatients.poll();
        if (!normalQueue.isEmpty()) return normalQueue.poll();
        return null;
    }

    public static void displayQueue(){
        if (emergencyPatients.isEmpty() && normalQueue.isEmpty()) {
            System.out.println("Danh sach rong");
            return;
        }
        System.out.println("Danh sach cap cuu");
        for (EmergencyPatient x : emergencyPatients){
            System.out.println(x);
        }
        System.out.println("Danh sach thuong :");
        for (EmergencyPatient x : normalQueue){
            System.out.println(x);
        }
    }
}
