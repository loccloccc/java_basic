package bai2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PatientQueue {
    static Queue<Patient> patients = new LinkedList<>();
    static Scanner sc = new Scanner(System.in);
    static Patient patient = new Patient();

    static void main(String[] args) {
        int choice;
        do {
            menu();
            System.out.println("Lua chon cua ban :");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    addPatient(patient);
                    break;
                case 2:
                    patient = callNextPatient();
                    if (patient == null) System.out.println("danh sach ho so rong");
                    else System.out.println(patient);
                    break;
                case 3:
                    patient = peekNextPatient();
                    if (patient == null) System.out.println("danh sach ho so rong");
                    else System.out.println(patient);
                    break;
                case 4:
                    if (isEmpty() == false) System.out.println("Danh sach ho so rong");
                    else System.out.println("Dang co " + patients.size() + " trong danh sach");
                    break;
                case 5:
                    display();
                    break;
                case 6:
                    System.out.println("Thoat chuong trinh");
                    break;
                default:
                    System.out.println("khong co lua chon nay ");
            }
        }while (choice!=6);
    }

    public static void menu(){
        System.out.println("1 Them benh nhan");
        System.out.println("2 Goi benh nhan");
        System.out.println("3 Xem benh nhan tiep theo");
        System.out.println("4 Kiem tra rong");
        System.out.println("5 Xem tat ca benh nhan");
        System.out.println("6 Thoat");
    }

    public static void addPatient(Patient p){
        System.out.println("Nhap ma benh nhan : ");
        p.setId(sc.nextLine());
        System.out.println("Nhap ten benh nhan : ");
        p.setName(sc.nextLine());
        System.out.println("Nhap tuoi benh nhan : ");
        p.setAge(sc.nextInt());
        patients.add(p);
        System.out.println("Them benh nhan thanh cong .");
    }

    public static Patient callNextPatient(){
        if (patients.isEmpty()) return null;
        return patients.poll();
    }

    public static Patient peekNextPatient(){
        if (patients.isEmpty()) return null;
        return patients.peek();
    }

    public static boolean isEmpty(){
        if (patients.isEmpty()) return false;
        return true;
    }

    public static void display(){
        System.out.println(patients);
    }
}
