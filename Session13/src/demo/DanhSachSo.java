package demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DanhSachSo {
    static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println("Danh sach ban dau : ");
        System.out.println("Duyet bang chi so : ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println("Duyet bang forEarch :");
        for (Integer x : list){
            System.out.print(x + " ");
        }

        System.out.println("Duyet bang Iterator :");
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) System.out.print(it.next() + " ");
    }
}
