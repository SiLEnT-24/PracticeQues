class MovieTicket {

    private String movieName;
    private double ticketPrice;
    private int numberOfTickets;

    public void setMovieName(String name) {
        movieName = name;
    }

    public void setTicketPrice(double price) {
        ticketPrice = price;
    }

    public void setNumberOfTickets(int tickets) {
        numberOfTickets = tickets;
    }

    public String getMovieName() {
        return movieName;
    }

    public double getTotalCost() {

        double total = ticketPrice * numberOfTickets;

        if (numberOfTickets >= 5) {
            total = total - (total * 5 / 100);
        }

        return total;
    }
}

public class MovieBooking {
    public static void main(String[] args) {

        MovieTicket m = new MovieTicket();

        m.setMovieName("Avengers");
        m.setTicketPrice(250);
        m.setNumberOfTickets(5);

        System.out.println("Movie : " + m.getMovieName());
        System.out.println("Total Cost : " + m.getTotalCost());
    }
}