package bai6;

import java.util.ArrayList;
import java.util.List;

public class MedicineManager {
    private List<Medicine> medicineList;

    public MedicineManager(List<Medicine> medicineList) {
        this.medicineList = new ArrayList<>();
    }
    public MedicineManager() {}

    // them thuoc
    public boolean add(Medicine m){
        return medicineList.add(m);
    }
    // sua so luong
    public Medicine updateQuantity(String id , int newQuantity){
        int index = checkId(id);
        if (index == -1){
            return null;
        }
        Medicine medicine = medicineList.get(index);

        if (newQuantity == 0) {
            return medicineList.remove(index);
        }

        medicine.setQuantity(newQuantity);
        return medicine;
    }
    // xoa thuoc
    public Medicine deleteMedici(String id){
        int index = checkId(id);
        if (index == -1){
            return null;
        }
        return  medicineList.remove(index);
    }
    // in hoa don
    public void display(){
        double total = 0;
        if (medicineList.isEmpty()){
            System.out.println("khong co don thuoc nao ");
            return;
        }
        System.out.println("Don thuoc cua ban : ");
        for (Medicine m : medicineList){
            System.out.println("Ten thuoc :  " + m.getDrugName() + " So luong : " + m.getQuantity() + " Gia : " + m.getUnitPrice());
            total+=(m.getQuantity()*m.getUnitPrice());
        }
        System.out.println("Thanh tien : " + total);
    }
    // tim thuoc gia re < 50.000;
    public void displaysmall50(){
        if (medicineList.isEmpty()){
            System.out.println("khong co don thuoc nao ");
            return;
        }
        System.out.println("Don thuoc cua ban : ");
        for (Medicine m : medicineList){
            if (m.getUnitPrice() < 50000){
                System.out.println("Ten thuoc :  " + m.getDrugName() + " So luong : " + m.getQuantity() + " Gia : " + m.getUnitPrice());
            }
        }
    }
    // check id
    public int checkId(String id){
        for (int i = 0; i < medicineList.size(); i++) {
            if (medicineList.get(i).getDrugID().compareTo(id) == 0){
                return i;
            }
        }
        return -1;
    }
}
