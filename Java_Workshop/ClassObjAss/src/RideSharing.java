class Ride {

    private String customerName;
    private double distanceTravelled;
    private double pricePerKm;
    private double surgeMultiplier;

    public void setCustomerName(String name) {
        customerName = name;
    }

    public void setDistanceTravelled(double distance) {
        distanceTravelled = distance;
    }

    public void setPricePerKm(double price) {
        pricePerKm = price;
    }

    public void setSurgeMultiplier(double surge) {
        surgeMultiplier = surge;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getFinalFare() {

        double baseFare = distanceTravelled * pricePerKm;
        double finalFare = baseFare * surgeMultiplier;

        if (distanceTravelled > 20) {
            finalFare = finalFare - (finalFare * 10 / 100);
        }

        if (surgeMultiplier > 1.5) {
            finalFare = finalFare + 50;
        }

        return finalFare;
    }
}

public class RideSharing {
    public static void main(String[] args) {

        Ride r = new Ride();

        r.setCustomerName("Harsh");
        r.setDistanceTravelled(25);
        r.setPricePerKm(20);
        r.setSurgeMultiplier(2);

        System.out.println("Customer : " + r.getCustomerName());
        System.out.println("Final Fare : " + r.getFinalFare());
    }
}