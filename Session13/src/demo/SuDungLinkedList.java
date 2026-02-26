package demo;

import java.util.LinkedList;
import java.util.List;

public class SuDungLinkedList {
    static void main(String[] args) {
        List<String> ds = new LinkedList<>();
        ds.add("Cuong");
        ds.add("Binh");
        ds.add("Tien");
        ds.add("Dung");
        System.out.println("So luong phan tu :  " + ds.size());
        System.out.println("Duyet : ");
        for (String x : ds){
            System.out.print(x+ " ");
        }
    }
}
