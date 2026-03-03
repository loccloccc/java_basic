package miniPrj;

import java.util.List;

public interface IRepository<T> {
    public boolean add(T item);

    boolean add(Product item);

    public boolean removeById(String id);
    public T findById(String id);
    public List<T> findAll();
}
