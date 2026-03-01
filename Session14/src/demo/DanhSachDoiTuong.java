package demo;

import java.util.HashSet;
import java.util.Set;

public class DanhSachDoiTuong {
    static void main(String[] args) {
        Set<Student> list = new HashSet<>();
        list.add(new Student(1,"Cuong","CNTT4"));
        list.add(new Student(1,"Cuong","CNTT4"));
        for (Student s:list){
            System.out.println(s);
        }
    }
}
