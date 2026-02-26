package bai5;

import java.util.Scanner;

public class Main {
    private static PatientManager patientManager = new PatientManager();
    static Scanner sc = new Scanner(System.in);

    static void main(String[] args) {
        runMain();
    }
    public static void menu(){
        System.out.println("+==================================+");
        System.out.println("| [1] . Tiep nhan benh nhan .      |");
        System.out.println("| [2] . Cap nhap chuan doan .      |");
        System.out.println("| [3] . Xuat vien .                |");
        System.out.println("| [4] . Sap xep  .                 |");
        System.out.println("| [5] . Hien thi .                 |");
        System.out.println("| [6] . Thoat                      |");
        System.out.println("+==================================+");
    }
    public static void add(){
        Patient patient = new Patient();
        System.out.println("Nhap ma benh nhan : ");
        String id = sc.next();
        patient.setId(id);
        System.out.println("Nhap ten benh nhan : ");
        String name = sc.next();
        patient.setFullName(name);
        System.out.println("Nhap tuoi benh nhan : ");
        int age = sc.nextInt();
        patient.setAge(age);
        System.out.println("Nhap benh ly :");
        String Pathology = sc.nextLine();
        sc.nextLine();
        patient.setDiagnosis(Pathology);

        boolean checkAdd = patientManager.addPatient(patient);
        if (checkAdd) System.out.println("Them benh nhan thanh cong");
        else System.out.println("Them benh nhan that bai");
    }

    public static void update(){
        Patient patient = new Patient();
        System.out.println("Nhap ma benh nhan : ");
        String id = sc.nextLine();
        int reslut = patientManager.checkId(id);
        if (reslut==-1) System.out.println("Khong ton tai");
        else {
            patient.setId(id);
            System.out.println("Nhap ten benh nhan : ");
            String fullName = sc.nextLine();
            patient.setFullName(fullName);
            System.out.println("Nhap tuoi benh nhan :");
            int age = sc.nextInt();
            patient.setAge(age);
            System.out.println("Nhap benh li : ");
            String Pathology = sc.nextLine();
            patient.setDiagnosis(Pathology);
            Patient patientUpdate = patientManager.updateID(id,patient);
            if (patientUpdate == null) System.out.println("Cap nhat khong thanh cong");
            else System.out.println("cap nhat thanh cong");
        }
    }

    public static void delete(){
        System.out.println("Nhap ma benh nhan xuat vien : ");
        String id = sc.nextLine();
        int checkId = patientManager.checkId(id);
        if (checkId==-1){
            System.out.println("Ma benh nhan khong ton tai");
        }else {
            Patient patientDelete = patientManager.deleteID(id);
            if (patientDelete == null) System.out.println("Xuat vien that bai");
            System.out.println("Xoa thanh cong");
        }
    }

    public static void runMain(){
        int choice;
        do {
            menu();
            System.out.println("Lua chon cua ban :");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    add();
                    break;
                case 2:
                    update();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    patientManager.sort();
                    break;
                case 5:
                    patientManager.render();
                    break;
                case 6:
                    System.out.println("Thoat chuong trinh");
                    break;
                default:
                    System.out.println("khong co lua chon nay");
            }
        }while (choice!=6);
    }
}
