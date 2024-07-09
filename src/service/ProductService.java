package service;


import data.ProductDao;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * {@link ProductService} provides an API that allows to manage {@link Product}s.
 * <p>
 * TODO: 1. Using {@link ProductDao} implement method {@link ProductService#addProduct(Product)}}
 * TODO: 2. Using {@link ProductDao} implement method {@link ProductService#searchProducts(String)}
 */
public class ProductService {
    private final IProductDao dao;
    public ProductService(IProductDao dao){
        this.dao = dao;

    }

    /**
     * Adds a new product to the system.
     *
     * @param product a product to add
     * @return {@code true} if a product was added, {@code false} otherwise.
     */

    public boolean addProduct(@NotNull Product product) {
        // TODO: implement this method
        return dao.add(product);
    }

    /**
     * Returns all products that contains the given query in the name or description.
     *
     * @param query a search query
     * @return a list of found products
     */
    public List<Product> searchProducts(String query) {
        // TODO: implement this method
        List<Product> result = new ArrayList<>();

        for (Product item : dao.findAll()) {
            if (item.getName().contains(query) || item.getDescription().contains(query)) {
                result.add(item);
            }
        }
        return result;
    }


}
