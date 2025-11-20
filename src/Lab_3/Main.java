package Lab_3;

public class Main {

    public static void main(String[] args) {

        Product apple = new Product(1, "fruits", 1, "apple", "Russia", 31, "oblApples");
        Product apple_1 = new Product(2, "fruits", 1, "apple", "Russia", 31, "oblApples");
        Product apple_2 = new Product(4, "fruits", 1, "apple", "Russia", 31, "oblApples");
        Product apple_3 = new Product(3, "fruits", 1, "apple", "Russia", 31, "oblApples");
        Product apple_4 = new Product(5, "fruits", 1, "apple", "Russia", 31, "oblApples");
        Product banana = new Product(6, "fruits", 2, "banana", "Zimbabve", 100, "ZimbabveINC");

        GroupProduct groupProduct = new GroupProduct(1);

        groupProduct.addProduct(apple);
        groupProduct.addProduct(apple_1);
        groupProduct.addProduct(apple_2);
        groupProduct.addProduct(apple_3);
        groupProduct.addProduct(apple_4);
        groupProduct.addProduct(banana);

        System.out.println(groupProduct.getProduct(2));
        System.out.println(groupProduct.getProduct(7));
        System.out.println(groupProduct.getAllProducts());


        System.out.println(groupProduct.removeProductById(6));

        groupProduct.sortByProductId();

        System.out.println(groupProduct.getAllProducts());

    }

}
