class HotelBooking {
    String customerName;
    String roomType;

    {
        roomType = "Standard";
        System.out.println("Booking Initialized");
    }

    HotelBooking() {
        this("Guest", "Standard");
    }

    HotelBooking(String customerName) {
        this(customerName, "Standard");
    }

    HotelBooking(String customerName, String roomType) {
        this.customerName = customerName;
        this.roomType = roomType;

        System.out.println("Customer: " + customerName);
        System.out.println("Room Type: " + roomType);
    }

    public static void main(String[] args) {
        new HotelBooking("Aman", "Deluxe");
    }
}