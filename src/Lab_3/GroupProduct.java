package Lab_3;
import java.util.ArrayList;

public class GroupProduct {

    private int id;
    private ArrayList<Product> products;

    public GroupProduct(int id) {
        this.id = id;
        this.products = new ArrayList<>();
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProduct(int productID) {
        for (Product product : products) {
            if (product.getProductID() == productID) {
                return product;
            }
        }
        return null;
    }

    public ArrayList<Product> getAllProducts() {
        return products;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public boolean removeProductById(int productID) {
        for (Product product : products) {
            if (product.getProductID() == productID) {
                products.remove(product);
                return true;
            }
        }
        return false;
    }

    public void sortByProductId() {
        int n = products.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                Product p1 = products.get(j);
                Product p2 = products.get(j + 1);
                if (p1.getProductID() > p2.getProductID()) {
                    // Меняем местами элементы
                    products.set(j, p2);
                    products.set(j + 1, p1);
                }
            }
        }
    }
}
