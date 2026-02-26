package bai6;

import java.util.Scanner;

public class Main {

    private static MedicineManager manager = new MedicineManager();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            renderMenu();
            System.out.print("Lựa chọn của bạn: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    Medicine medicine = new Medicine();

                    System.out.print("Nhập mã thuốc: ");
                    medicine.setDrugID(sc.nextLine());

                    System.out.print("Nhập tên thuốc: ");
                    medicine.setDrugName(sc.nextLine());

                    System.out.print("Nhập giá thuốc: ");
                    medicine.setUnitPrice(sc.nextDouble());

                    System.out.print("Nhập số lượng: ");
                    medicine.setQuantity(sc.nextInt());
                    sc.nextLine();

                    if (manager.add(medicine))
                        System.out.println("Thêm thuốc thành công!");
                    else
                        System.out.println("Thêm thuốc thất bại!");
                    break;

                case 2:
                    System.out.print("Nhập mã thuốc: ");
                    String id2 = sc.nextLine();

                    if (manager.checkId(id2) == -1) {
                        System.out.println("Không tồn tại thuốc!");
                    } else {
                        System.out.print("Nhập số lượng mới: ");
                        int quantity2 = sc.nextInt();
                        sc.nextLine();

                        Medicine updated = manager.updateQuantity(id2, quantity2);
                        if (updated == null)
                            System.out.println("Cập nhật thất bại!");
                        else
                            System.out.println("Cập nhật thành công!");
                    }
                    break;

                case 3:
                    System.out.print("Nhập mã thuốc muốn xóa: ");
                    String id3 = sc.nextLine();

                    Medicine deleted = manager.deleteMedicine(id3);
                    if (deleted == null)
                        System.out.println("Không tồn tại thuốc!");
                    else
                        System.out.println("Xóa thành công!");
                    break;

                case 4:
                    manager.display();
                    break;

                case 5:
                    manager.displaySmall50();
                    break;

                case 6:
                    System.out.println("Thoát chương trình.");
                    break;

                default:
                    System.out.println("Không có lựa chọn này!");
            }

        } while (choice != 6);
    }

    public static void renderMenu() {
        System.out.println("\n===== MENU =====");
        System.out.println("1. Thêm thuốc");
        System.out.println("2. Điều chỉnh số lượng");
        System.out.println("3. Xóa thuốc");
        System.out.println("4. In hóa đơn");
        System.out.println("5. Thuốc giá < 50.000");
        System.out.println("6. Thoát");
    }
}