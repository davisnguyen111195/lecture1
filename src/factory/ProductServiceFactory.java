package factory;


import org.jetbrains.annotations.NotNull;
import service.Product;
import service.ProductService;

import java.util.*;

/**
 * {@link ProductServiceFactory} is used to create an instance of {@link ProductService}
 * <p>
 * TODO: 1. Implement method {@link ProductServiceFactory#createProductService()}
 */
public class ProductServiceFactory {
    /**
     * Create a new instance of {@link ProductService}
     *
     * @return ProductService
     */
    public ProductService createProductService() {
        // TODO: implement this method
        return new ProductService();
    }
}
