class MovieTicket {
    String movieName;
    String seatNo;

    {
        System.out.println("Booking Started");
    }

    MovieTicket() {
        this("Regular Movie", "Not Assigned");
    }

    MovieTicket(String movieName) {
        this(movieName, "Not Assigned");
    }

    MovieTicket(String movieName, String seatNo) {
        this.movieName = movieName;
        this.seatNo = seatNo;

        System.out.println("Movie: " + movieName);
        System.out.println("Seat No: " + seatNo);
    }

    public static void main(String[] args) {
        new MovieTicket("Avengers", "A12");
    }
}