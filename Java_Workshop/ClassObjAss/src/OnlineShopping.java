class ShoppingCart {

    private String productName;
    private double price;
    private int quantity;

    public void setProductName(String name) {
        productName = name;
    }

    public void setPrice(double p) {
        price = p;
    }

    public void setQuantity(int q) {
        quantity = q;
    }

    public String getProductName() {
        return productName;
    }

    public double getFinalAmount() {

        double total = price * quantity;

        if (total > 5000) {
            total = total - (total * 10 / 100);
        }

        return total;
    }
}

public class OnlineShopping {
    public static void main(String[] args) {

        ShoppingCart s = new ShoppingCart();

        s.setProductName("Laptop");
        s.setPrice(6000);
        s.setQuantity(1);

        System.out.println("Product : " + s.getProductName());
        System.out.println("Final Amount : " + s.getFinalAmount());
    }
}