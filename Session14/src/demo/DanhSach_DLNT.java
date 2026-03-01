package demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DanhSach_DLNT {
    static void main(String[] args) {
        Set<Integer> list = new HashSet<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(2);

        System.out.println("Danh sach cac phan tu khong trung lap");
        System.out.println("Cach 1 : ");
        for (Integer i : list){
            System.out.println(i + " ");
        }
        System.out.println("cach 2");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
