package hashcode;

public class App {

    static void main() {
        Product product = new Product("Thinkpad", 5000000);

        System.out.println(product.hashCode());
    }

}
