package miniPrj;

import java.util.List;

public class Main {
    static void main(String[] args) {
        ProductRepository repository = new ProductRepository() {};
        repository.add(new ElectronicProduct("EP1","May tinh",10000000,12));
        repository.add(new ElectronicProduct("EP2","Ti vi",14000000,12));
        repository.add(new FoodProduct("FP1","Mi cay",20000,5));
        repository.add(new FoodProduct("FP2","Sua chua",25000,10));
        // hien thi toan bo
        List<Product> products = repository.findAll();

        if (products != null && !products.isEmpty()) {
            for (Product p : products) {
                p.displayInfo();
                System.out.println("Thành tiền: " + p.calculateFinalPrice());
                System.out.println("----------------------------");
            }
        }

        String searchId = "EP1";
        Product found = repository.findById(searchId);

        if (found != null) {
            found.displayInfo();
            System.out.println("Thành tiền: " + found.calculateFinalPrice());
        } else {
            System.out.println("Không tìm thấy sản phẩm!");
        }



    }


}
