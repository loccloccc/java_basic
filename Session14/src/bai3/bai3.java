package bai3;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class bai3 {
    static class Medicine{
        private String name;

        public Medicine() {
        }

        public Medicine(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            Medicine medicine = (Medicine) o;
            return Objects.equals(name, medicine.name);
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(name);
        }
    }

    static void main(String[] args) {
        // input
        // thuoc
        Set<String> medicines = new HashSet<>();
        Set<String> allergys = new HashSet<>();

        medicines.add("Aspirin");
        medicines.add("Caffeine");
        medicines.add("Paracetamol");

        //
        allergys.add("Penicillin");
        allergys.add("Aspirin");
        for (String x : medicines) System.out.println(x);
        for (String x : allergys) System.out.println(x);
        // hop
        Set<String> hop = new HashSet<>();
        hop.addAll(medicines);
        hop.retainAll(allergys);
        System.out.print("Canh bao di ung : ");
        for (String x : hop) System.out.print(x + " ");
        System.out.println();
        // hieu
        Set<String> hieu = new HashSet<>();
        hieu.addAll(medicines);
        hieu.removeAll(allergys);
        System.out.print("Thanh phan an toan  : ");
        for (String x : hieu) System.out.print(x + " ");



        // hieu

    }
}
