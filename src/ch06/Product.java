package ch06;

public class Product {
    static int count = 0;
    int serialNo;

    {
        System.out.println("Instance Block...");
        ++count;
        serialNo = count;
    }

    public Product() {
        System.out.println("Product Constructor...");
    }
}

class ProductTest {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

        System.out.println("p1's serial number is: " + p1.serialNo);
        System.out.println("p2's serial number is: " + p2.serialNo);
        System.out.println("p3's serial number is: " + p3.serialNo);
    }
}
