class ElectricityBill {

    private String customerName;
    private int unitsConsumed;
    private double pricePerUnit;

    public void setCustomerName(String name) {
        customerName = name;
    }

    public void setUnitsConsumed(int units) {
        unitsConsumed = units;
    }

    public void setPricePerUnit(double price) {
        pricePerUnit = price;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getTotalBill() {
        double bill = unitsConsumed * pricePerUnit;

        if (unitsConsumed > 500) {
            bill = bill + (bill * 10 / 100);
        }

        return bill;
    }
}

public class ElectricitySystem {
    public static void main(String[] args) {

        ElectricityBill e = new ElectricityBill();

        e.setCustomerName("Rahul");
        e.setUnitsConsumed(600);
        e.setPricePerUnit(8);

        System.out.println("Customer Name : " + e.getCustomerName());
        System.out.println("Final Bill : " + e.getTotalBill());
    }
}