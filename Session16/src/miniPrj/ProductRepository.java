package miniPrj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public  class ProductRepository implements IRepository<Product>{
    // luu danh sach
    ArrayList<Product> arrayList = new ArrayList<>();
    // dung hashmap de ho tro tim kiem theo id
    HashMap<String,Product> hashMap = new HashMap<>();

    @Override
    public boolean add(Product item) {
        arrayList.add(item);
        hashMap.put(item.getId(),item);
        return true;
    }

    @Override
    public boolean removeById(String id) {
        for (Product x : arrayList){
            if (x.getId().equals(id)){
                arrayList.remove(x);
                return true;
            }
        }
        return false;
    }

    @Override
    public Product findById(String id) {
        for (Product x : arrayList){
            if (x.getId().equals(id)){
                return x;
            }
        }
        return null;
    }

    @Override
    public List<Product> findAll() {
        return arrayList;
    }
}
