package factory;


import data.ProductDao;
import service.IProductDao;
import service.ProductService;

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

    private final IProductDao dao = new ProductDao();
    public ProductService createProductService() {
        // TODO: implement this method
        return new ProductService(dao);
    }
}
