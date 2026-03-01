package bai5;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    static void main(String[] args) {
        Set<Patient> patients = new TreeSet<>();
        patients.add(new Patient("A",2,5));
        patients.add(new Patient("Bình", 1, 3));
        patients.add(new Patient("Chi", 1, 1));
        patients.add(new Patient("Dũng", 3, 2));

        for (Patient x : patients){
            System.out.println(x);
        }
    }
}
