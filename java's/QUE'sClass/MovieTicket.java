class MovieTicket{
    private String movieName;
    private double ticketPrice;
    private int numberOfTickets;

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public String getMovieName() {
        return movieName;
    }

    public double getTotalPrice() {
        double total = ticketPrice * numberOfTickets;
        if (numberOfTickets >= 5) {
            total -= total * 0.05;
        }
        return total;
    }

    public static void main(String[] args) {
        MovieTicket m = new MovieTicket();

        m.setMovieName("Avengers");
        m.setTicketPrice(250);
        m.setNumberOfTickets(5);

        System.out.println("Movie: " + m.getMovieName());
        System.out.println("Total Price: " + m.getTotalPrice());
    }
}