import factory.ProductServiceFactory;
import service.Product;
import service.ProductService;

import java.util.List;
import java.util.ListIterator;

public class Exercise1Main {
    public static void main(String[] args) {
        ProductService productService = new ProductServiceFactory().createProductService();

        Product iPhone12 = new Product(
            "1",
            "iPhone 12",
            "The iPhone 12 and iPhone 12 Mini (stylized as iPhone 12 mini) are smartphones designed, developed, and marketed by Apple Inc. " +
                "They are the fourteenth-generation, lower-priced iPhones, succeeding the iPhone 11. " +
                "They were unveiled at an Apple Special Event at Apple Park in Cupertino, California on October 13, 2020 " +
                "alongside the higher-end iPhone 12 Pro and iPhone 12 Pro Max flagships.",
            799.99
        );
        Product iPhone12x = new Product(
                "2",
                "iPhone 12",
                "The iPhone 12 and iPhone 12 Mini (stylized as iPhone 12 mini) are smartphones designed, developed, and marketed by Apple Inc. " +
                        "They are the fourteenth-generation, lower-priced iPhones, succeeding the iPhone 11. " +
                        "They were unveiled at an Apple Special Event at Apple Park in Cupertino, California on October 13, 2020 " +
                        "alongside the higher-end iPhone 12 Pro and iPhone 12 Pro Max flagships.",
                799.99
        );
        Product iPhone12s = new Product(
                "3",
                "iPhone 12",
                "The iPhone 12 and iPhone 12 Mini (stylized as iPhone 12 mini) are smartphones designed, developed, and marketed by Apple Inc. " +
                        "They are the fourteenth-generation, lower-priced iPhones, succeeding the iPhone 11. " +
                        "They were unveiled at an Apple Special Event at Apple Park in Cupertino, California on October 13, 2020 " +
                        "alongside the higher-end iPhone 12 Pro and iPhone 12 Pro Max flagships.",
                799.99
        );
        Product iPhone12Pro = new Product(
            "4",
            "iPhone 12 Pro",
            "The iPhone 12 Pro and iPhone 12 Pro Max are smartphones designed, developed, and marketed by Apple Inc. " +
                "They are the flagship smartphones in the fourteenth-generation iPhone lineup, succeeding the iPhone 11 Pro and iPhone 11 Pro Max, " +
                "and were unveiled on October 13, 2020, at Apple Park in Cupertino, California, alongside the lower-end iPhone 12 and iPhone 12 Mini.",
            999.99
        );
        Product samsungGalaxyS21 = new Product(
            "5",
            "Samsung Galaxy S21",
            "The Samsung Galaxy S21 is a series of Android-based smartphones designed, developed, marketed, and manufactured by Samsung Electronics as part of its Galaxy S series. " +
                "They collectively serve as the successor to the Galaxy S20 series. The S21 series is the first Galaxy S lineup to support the S Pen stylus, " +
                "which is only compatible with the Ultra model.",
            799.99
        );
        Product samsungGalaxyS21Ultra = new Product(
            "6",
            "Samsung Galaxy S21 Ultra",
            "The Samsung Galaxy S21 Ultra is a series of Android-based smartphones designed, developed, marketed, and manufactured by Samsung Electronics as part of its Galaxy S series. " +
                "They collectively serve as the successor to the Galaxy S20 series. The S21 series is the first Galaxy S lineup to support the S Pen stylus, " +
                "which is only compatible with the Ultra model.",
            1199.99
        );

        productService.addProduct(iPhone12);
        productService.addProduct(iPhone12x);
        productService.addProduct(iPhone12s);

        productService.addProduct(iPhone12Pro);
        productService.addProduct(samsungGalaxyS21);
        productService.addProduct(samsungGalaxyS21Ultra);

        List<Product> find = productService.searchProducts("iPhone 12");

        for (Product item : find) {
            System.out.println(item.getId() +  "#" + item.getName());
        }
    }
}
