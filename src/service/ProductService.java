package service;


import data.ProductDao;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * {@link ProductService} provides an API that allows to manage {@link Product}s.
 * <p>
 * TODO: 1. Using {@link ProductDao} implement method {@link ProductService#addProduct(Product)}}
 * TODO: 2. Using {@link ProductDao} implement method {@link ProductService#searchProducts(String)}
 */
public class ProductService {
    private final List<Product> productService = new ArrayList<>();

    /**
     * Adds a new product to the system.
     *
     * @param product a product to add
     * @return {@code true} if a product was added, {@code false} otherwise.
     */

    public boolean addProduct(@NotNull Product product) {
        // TODO: implement this method
        return productService.add(product);
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

        for (Product item : productService) {
            if (item.getName().equals(query)) {
                result.add(item);
            }
        }
        return result;
    }
}
