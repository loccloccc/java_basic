package bai1;

import java.util.Scanner;
import java.util.Stack;

public class MedicalRecordHistory {
    static Stack<EditAction> editActions = new Stack<>();
    static Scanner sc = new Scanner(System.in);
    static EditAction editAction = new EditAction();
    static void main(String[] args) {


        int choice;
        do {
            menu();
            System.out.println("Nhap lua chon : ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    // them phan tu

                    addEdit(editAction);
                    break;
                case 2:
                    editAction = undoEdit();
                    if (editAction == null){
                        System.out.println("Danh sach ho so rong");
                    }else {
                        System.out.println(editAction);
                    }
                    break;
                case 3:
                    editAction = getLatestEdit();
                    if (editAction == null){
                        System.out.println("Danh sach ho so rong");
                    }else {
                        System.out.println(editAction);
                    }
                    break;
                case 4:
                    if (editActions.empty()){
                        System.out.println("Khong co ho so nao");
                    }else {
                        System.out.println("dang co " + editActions.size() + " trong he thong ");
                    }
                    break;
                case 5:
                    System.out.println(editActions.toString());
                    break;
                case 6:
                    break;
                default:
                    System.out.println("khong co lua chon nay");
            }
        }while (choice!=6);
    }
    public static void menu(){
        System.out.println("1 them");
        System.out.println("2 xoa");
        System.out.println("3 lay ra cai gan day nhat");
        System.out.println("4 kiem tra he thong");
        System.out.println("5 hien thi toan bo lich su");
        System.out.println("6 thoat");
    }

    public static void addEdit(EditAction action){
        System.out.println("Nhap mo ta benh an :");
        action.setDescription(sc.nextLine());
        System.out.println("Nhap thoi gian (dd/mm/yyyy) ");
        action.setTime(sc.nextLine());
        editActions.push(action);
        System.out.println("Them thanh cong");
    }

    public static EditAction undoEdit(){
        if (editActions.empty()){
            return null;
        }else {
            return editActions.pop();
        }
    }
    public static EditAction getLatestEdit(){
        if (editActions.empty()){
            return null;
        }else {
            return editActions.peek();
        }
    }
}
