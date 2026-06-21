class LaptopPurchase {
    String model;
    double price;
    String warranty;

    {
        warranty = "1 Year";
        System.out.println("Purchase Initialized");
    }

    LaptopPurchase() {
        this("Basic Laptop", 0);
    }

    LaptopPurchase(String model) {
        this(model, 0);
    }

    LaptopPurchase(String model, double price) {
        this.model = model;
        this.price = price;

        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Warranty: " + warranty);
    }

    public static void main(String[] args) {
        new LaptopPurchase("Dell Inspiron", 55000);
    }
}