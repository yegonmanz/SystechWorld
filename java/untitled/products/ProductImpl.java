package products;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductImpl implements ProductI {
    private List<Product> productList = new ArrayList<>();

    @Override
    public Product createProduct(Product product, ProductType productType) {
        product.setProductType(productType);
        productList.add(product);  // Add the product to our list
        return product;
    }

    @Override
    public List<Product> getProducts() {
        return productList;  // Return the actual list of products
    }

    @Override
    public Product applyDiscount(Product product) throws Exception {

        ProductType productType = product.getProductType();
        if (productType == null){
            throw new Exception("Product type not set.");
        }

        double discountTotal = 0.0;

        if (productType.getPercentageDiscount() != null){
            discountTotal = productType.getPercentageDiscount() * product.getPrice();
        }

        product.getProductType().getPercentageDiscount();

        Discount discount = new Discount();
        discount.setDescription("Discount for product");
        discount.setTotal(discountTotal);

        product.setPrice(product.getPrice() - discountTotal);

        return product;

    }

//    @Override
//    public Product purchaseProduct(Product product) {
//        while(true){
//            Scanner scanner = new Scanner(System.in);
//
//            System.out.println("Welcome " );
//
//        }
//    }
}
