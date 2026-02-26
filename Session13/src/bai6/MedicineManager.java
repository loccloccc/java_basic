package bai6;

import java.util.ArrayList;
import java.util.List;

public class MedicineManager {

    private List<Medicine> medicineList = new ArrayList<>();

    // thêm thuốc
    public boolean add(Medicine m) {
        return medicineList.add(m);
    }

    // sửa số lượng (nếu = 0 thì xóa)
    public Medicine updateQuantity(String id, int newQuantity) {
        int index = checkId(id);
        if (index == -1) {
            return null;
        }

        Medicine medicine = medicineList.get(index);

        if (newQuantity == 0) {
            return medicineList.remove(index);
        }

        medicine.setQuantity(newQuantity);
        return medicine;
    }

    // xóa thuốc
    public Medicine deleteMedicine(String id) {
        int index = checkId(id);
        if (index == -1) {
            return null;
        }
        return medicineList.remove(index);
    }

    // in hóa đơn
    public void display() {
        double total = 0;

        if (medicineList.isEmpty()) {
            System.out.println("Không có đơn thuốc nào.");
            return;
        }

        System.out.println("===== ĐƠN THUỐC =====");
        for (Medicine m : medicineList) {
            System.out.println("Tên thuốc: " + m.getDrugName()
                    + " | Số lượng: " + m.getQuantity()
                    + " | Giá: " + m.getUnitPrice());
            total += m.getQuantity() * m.getUnitPrice();
        }

        System.out.println("Thành tiền: " + total);
    }

    // thuốc giá < 50.000
    public void displaySmall50() {
        if (medicineList.isEmpty()) {
            System.out.println("Không có đơn thuốc nào.");
            return;
        }

        System.out.println("===== THUỐC GIÁ < 50.000 =====");
        for (Medicine m : medicineList) {
            if (m.getUnitPrice() < 50000) {
                System.out.println("Tên thuốc: " + m.getDrugName()
                        + " | Số lượng: " + m.getQuantity()
                        + " | Giá: " + m.getUnitPrice());
            }
        }
    }

    // kiểm tra ID
    public int checkId(String id) {
        for (int i = 0; i < medicineList.size(); i++) {
            if (medicineList.get(i).getDrugID().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}