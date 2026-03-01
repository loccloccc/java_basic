package bai4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Bai4 {
    static void main(String[] args) {
        List<String> list = new ArrayList<>(
                List.of("Cúm A", "Sốt xuất huyết", "Cúm A", "Covid-19", "Cúm A", "Sốt xuất huyết")
        );
        TreeMap<String,Integer> treeMap = new TreeMap<>();
        for (String s : list) {
            treeMap.put(s, treeMap.getOrDefault(s, 0) + 1);
        }
        for (Map.Entry<String,Integer> x : treeMap.entrySet()) {
            System.out.println(x.getKey() + " - " + x.getValue());
        }
    }
}
