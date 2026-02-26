package bai6;

import bai5.Patient;

import java.util.Scanner;

public class Main {
    private static  MedicineManager manager = new MedicineManager();
    static Scanner sc = new Scanner(System.in);
    static Medicine medicine = new Medicine();
    static void main(String[] args) {
        int choice ;
        do {
            renderMenu();
            System.out.println("Lua chon cua ban :");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Nhap ma thuoc : ");
                    String id = sc.nextLine();
                    medicine.setDrugID(id);
                    System.out.println("Nhap ten thuoc : ");
                    String name = sc.nextLine();
                    medicine.setDrugName(name);
                    System.out.println("Nhap gia thuoc : ");
                    double price = sc.nextDouble();
                    medicine.setUnitPrice(price);
                    System.out.println("nhap so luong thuoc : ");
                    int quantity = sc.nextInt();
                    medicine.setQuantity(quantity);
                    boolean checkAdd = manager.add(medicine);
                    if (checkAdd) System.out.println("Them benh nhan thanh cong");
                    else System.out.println("Them benh nhan that bai");
                    break;
                case 2:
                    System.out.println("nhap ma thuoc : ");
                    String id2 = sc.nextLine();

                    int reslut = manager.checkId(id2);
                    if (reslut==-1) System.out.println("Khong ton tai");
                    else {
                        System.out.println("Nhap so luong thuoc : ");
                        int quantity2 = sc.nextInt();
                        Medicine medicineUpdate = manager.updateQuantity(id2,quantity2);
                        if (medicineUpdate == null) System.out.println("Cap nhat khong thanh cong");
                        else System.out.println("cap nhat thanh cong");
                    }
                    break;
                case 3:
                    System.out.println("Nhap ma thuoc muon xoa : ");
                    String id3 = sc.nextLine();
                    int checkId = manager.checkId(id3);
                    if (checkId==-1){
                        System.out.println("Ma benh nhan khong ton tai");
                    }else {
                        Medicine medicineDelete = manager.deleteMedici(id3);
                        if (medicineDelete == null) System.out.println("Xuat vien that bai");
                        System.out.println("Xoa thanh cong");
                    }
                    break;
                case 4:
                    manager.display();
                    break;
                case 5:
                    manager.displaysmall50();
                    break;
                case 6:
                    System.out.println("thoat");
                    break;
                default:
                    System.out.println("khong co lua chon nay");
            }
        }while (choice!=6);

    }
    public static void renderMenu() {

        System.out.println("||=======================================MENU=======================================||");
        System.out.println("||                                                                                ||");
        System.out.println("||        1. Thêm thuốc vào đơn                                                  ||");
        System.out.println("||        2. Điều chỉnh số lượng                                                 ||");
        System.out.println("||        3. Xóa thuốc                                                           ||");
        System.out.println("||        4. In hóa đơn                                                          ||");
        System.out.println("||        5. Tìm thuốc giá rẻ                                                    ||");
        System.out.println("||        6. Thoát                                                               ||");
        System.out.println("||                                                                                ||");
        System.out.println("||================================================================================||");
    }
}
