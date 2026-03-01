package bai6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Loc",25,"Dau tim"));
        patients.add(new Patient("Lan",21,"Ung thu"));
        patients.add(new Patient("Duc",20,"dau dau"));
        patients.add(new Patient("Ngoc",18,"Dau chan"));

        Map<String,List<Patient>> map = new HashMap<>();

        for (Patient p : patients) {

            if (!map.containsKey(p.getTreatmentDepartment())) {
                map.put(p.getTreatmentDepartment(), new ArrayList<>());
            }

            map.get(p.getTreatmentDepartment()).add(p);
        }

        for (String dept : map.keySet()) {
            System.out.println("Khoa " + dept + " -> " + map.get(dept));
        }

        String maxDept = "";
        int maxSize = 0;

        for (String dept : map.keySet()) {
            int size = map.get(dept).size();
            if (size > maxSize) {
                maxSize = size;
                maxDept = dept;
            }
        }

        System.out.println("Khoa " + maxDept + " đang đông nhất (" + maxSize + " bệnh nhân)");
    }

}
