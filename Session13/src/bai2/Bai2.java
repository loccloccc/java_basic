package bai2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bai2 {
    static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(
          List.of("Paracetamol", "Ibuprofen", "Panadol", "Paracetamol", "Aspirin", "Ibuprofen")
        );
        ArrayList<String> newList = new ArrayList<>();
        for (String x : list){
            if (!newList.contains(x)){
                newList.add(x);
            }
        }
        for (int i = 0; i < newList.size(); i++) {
            for (int j = i + 1; j < newList.size(); j++) {
                if (newList.get(i).compareTo(newList.get(j)) > 0){
                    String temp = newList.get(i);
                    newList.set(i, newList.get(j));
                    newList.set(j, temp);
                }
            }
        }
        for (String x : newList){
            System.out.println(x + " ");
        }
    }
}
