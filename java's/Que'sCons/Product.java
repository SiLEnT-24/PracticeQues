class Product {
    String productName;
    double price;
    String category;

    {
        category = "General";
    }

    Product() {
        this("Unknown Product");
    }

    Product(String productName) {
        this(productName, 0);
    }

    Product(String productName, double price) {
        this(productName, price, "General");
    }

    Product(String productName, double price, String category) {
        this.productName = productName;
        this.price = price;
        this.category = category;

        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Category: " + category);
    }

    public static void main(String[] args) {
        new Product("Laptop", 65000, "Electronics");
    }
}