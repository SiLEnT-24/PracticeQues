package classesandobjects;
class ElectricityBill {
    private String customerName;
    private double unitsConsumed;
    private double pricePerUnit;

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setUnitsConsumed(double unitsConsumed) {
        this.unitsConsumed = unitsConsumed;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getTotalBill() {
        double bill = unitsConsumed * pricePerUnit;
        if (unitsConsumed > 500) {
            bill += bill * 0.10;
        }
        return bill;
    }

    public static void main(String[] args) {
        ElectricityBill e = new ElectricityBill();

        e.setCustomerName("Rahul");
        e.setUnitsConsumed(600);
        e.setPricePerUnit(8);

        System.out.println("Customer: " + e.getCustomerName());
        System.out.println("Final Bill: " + e.getTotalBill());
    }
}