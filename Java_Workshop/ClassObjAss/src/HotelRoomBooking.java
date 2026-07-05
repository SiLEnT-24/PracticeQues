class HotelBooking {

    private String guestName;
    private double roomPricePerNight;
    private int numberOfNights;

    public void setGuestName(String name) {
        guestName = name;
    }

    public void setRoomPricePerNight(double price) {
        roomPricePerNight = price;
    }

    public void setNumberOfNights(int nights) {
        numberOfNights = nights;
    }

    public String getGuestName() {
        return guestName;
    }

    public double getFinalBill() {

        double total = roomPricePerNight * numberOfNights;

        if (numberOfNights >= 7) {
            total = total - (total * 15 / 100);
        }

        return total;
    }
}

public class HotelRoomBooking {
    public static void main(String[] args) {

        HotelBooking h = new HotelBooking();

        h.setGuestName("Harsh");
        h.setRoomPricePerNight(2000);
        h.setNumberOfNights(8);

        System.out.println("Guest : " + h.getGuestName());
        System.out.println("Bill : " + h.getFinalBill());
    }
}