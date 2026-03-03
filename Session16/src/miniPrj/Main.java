package miniPrj;

public class Main {
    static void main(String[] args) {
        ProductRepository repository = new ProductRepository() {};
        repository.add(new ElectronicProduct("EP1","May tinh",10000000,12));
        repository.add(new ElectronicProduct("EP2","Ti vi",14000000,12));
        repository.add(new FoodProduct("FP1","Mi cay",20000,5));
        repository.add(new FoodProduct("FP2","Sua chua",25000,10));
        // hien thi toan bo




    }


}
