package bai1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bai1 {
    static void main(String[] args) {
        ArrayList<Double> arrayList = new ArrayList<>(
                List.of(36.5, 40.2, 37.0, 12.5, 39.8, 99.9, 36.8)
        );
        Iterator<Double> it = arrayList.iterator();
        System.out.println("Danh sách ban đầu :");
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println();
        System.out.println("Danh sách sau khi lọc : ");
        double sum = 0;
        int count = 0;
        it = arrayList.iterator();
        while (it.hasNext()){
            double element = it.next();
            if (element >= 34.0 && element <= 42.0){
                System.out.print(element + " ");
                sum+=element;
                count++;
            }
            it.remove();
        }
        System.out.println();
        System.out.println("Nhiệt độ trung bình : " + sum/count);
    }
}
