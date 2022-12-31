package checkpoint.products;

public class ProductRepository {

    private Product[] products = new Product[]{
            new Coffee(1, "Americano", 3000, false),
            new Coffee(2, "Caffe latte", 3500, false),
            new Tea(3, "Peppermint tea", 4000, false),
            new Tea(4, "Rooibos tea", 4500, false)
    };

    public Product[] getProducts() {
        return products;
    }

    public Product findById(int productId) {
        for (Product product : products) {
            if (product.getId() == productId) return product;
        }
        return null;
    }

}
