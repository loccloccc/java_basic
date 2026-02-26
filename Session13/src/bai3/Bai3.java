package bai3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Bai3 {
    static <T> ArrayList<T> findCommonPatients(List<T> listA, List<T> listB){
        ArrayList<T> listC = new ArrayList<>(500);
        listC.addAll(listA);
        listC.addAll(listB);
        listC.trimToSize();
        Iterator<T> iteratorC = listC.iterator();
        ArrayList<T> listFinal = new ArrayList<>();
        while (iteratorC.hasNext()){
            T element = iteratorC.next();
            if (listC.indexOf(element) != listC.lastIndexOf(element) && !listFinal.contains(element)){
                listFinal.add(element);
            }
        }
        return listFinal;
    }

    public static void main(String[] args) {
        ArrayList<Integer> listA = new ArrayList<>(
                List.of(101, 102, 105)
        );
        ArrayList<Integer> listB = new ArrayList<>(
                List.of(102, 105, 108)
        );

        ArrayList<Integer> listFinal = findCommonPatients(listA, listB);
        Iterator<Integer> iteratorFinal = listFinal.iterator();

        while(iteratorFinal.hasNext()){
            int element = iteratorFinal.next();
            System.out.print(element);
            if(iteratorFinal.hasNext()){
                System.out.print(", ");
            }
        }
    }
}
