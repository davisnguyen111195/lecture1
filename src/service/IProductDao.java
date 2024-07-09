package service;

import java.util.Set;

public interface IProductDao {
    boolean add(Product product);
    Set<Product> findAll();

}
