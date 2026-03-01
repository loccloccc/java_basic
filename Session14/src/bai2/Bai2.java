package bai2;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class Bai2 {
    static class Medicine{
        private String idMedi;
        private String nameMedi;

        public Medicine() {
        }

        public Medicine(String idMedi, String nameMedi) {
            this.idMedi = idMedi;
            this.nameMedi = nameMedi;
        }

        public String getIdMedi() {
            return idMedi;
        }

        public void setIdMedi(String idMedi) {
            this.idMedi = idMedi;
        }

        public String getNameMedi() {
            return nameMedi;
        }

        public void setNameMedi(String nameMedi) {
            this.nameMedi = nameMedi;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            Medicine medicine = (Medicine) o;
            return Objects.equals(idMedi, medicine.idMedi) && Objects.equals(nameMedi, medicine.nameMedi);
        }

        @Override
        public int hashCode() {
            return Objects.hash(idMedi, nameMedi);
        }
    }

    static void main(String[] args) {
        Set<Medicine> medicines = new HashSet<>();
        medicines.add(new Medicine("T01","Paracdetamol"));
        medicines.add(new Medicine("T02","Ibuprofen"));
        medicines.add(new Medicine("T03","Cum"));
        medicines.add(new Medicine("T04","Sot"));
        medicines.add(new Medicine("T05","Met"));

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma : ");
        String id = sc.nextLine();
        int flag = -1;
        for (Medicine m : medicines){
            if (m.getIdMedi().equals(id)){
                System.out.println("Ten thuoc : " + m.getNameMedi());
                flag = 0;
                break;
            }
        }
        if (flag==-1) System.out.println("Thuoc khong ton tai");
    }
}
