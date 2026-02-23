package SS10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class bai6 {
    static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1500));
        products.add(new Product("Phone", 800));
        products.add(new Product("Tablet", 1200));


        // 1. Anonymous Class -> sắp xếp theo giá tăng dần
        products.sort(new Comparator<Product>() {

            /*
             Anonymous Class thường dùng khi:
             - Cần tạo class có nhiều phương thức
             - Cần thêm biến/thuộc tính nội bộ
             - Cần logic phức tạp
             - Interface không phải functional interface
             */

            @Override
            public int compare(Product p1, Product p2) {
                return Double.compare(p1.getPrice(), p2.getPrice());
            }
        });

        System.out.println("Sort by price (Anonymous Class):");
        products.forEach(System.out::println);


        // ===============================
        // 2. Lambda Expression -> sắp xếp theo tên A-Z
        // ===============================
        Collections.sort(products,
                (p1, p2) -> p1.getName().compareTo(p2.getName())
        );

        System.out.println("\nSort by name (Lambda):");
        products.forEach(System.out::println);
    }
}
