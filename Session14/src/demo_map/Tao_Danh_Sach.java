package demo_map;

import demo.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Tao_Danh_Sach {
    static void main(String[] args) {
        Map<Integer , Student> list = new HashMap<>();

        list.put(1,new Student(1,"Loc","CNTT4"));
        list.put(2,new Student(2,"Loc","CNTT4"));
        System.out.println("Duyet 1:");
        Set<Integer> listKey = list.keySet();
    }
}
