class LibraryBook {

    private String bookName;
    private int daysLate;
    private double finePerDay;

    public void setBookName(String name) {
        bookName = name;
    }

    public void setDaysLate(int days) {
        daysLate = days;
    }

    public void setFinePerDay(double fine) {
        finePerDay = fine;
    }

    public String getBookName() {
        return bookName;
    }

    public double getTotalFine() {

        double totalFine = daysLate * finePerDay;

        if (daysLate > 10) {
            totalFine = totalFine + 100;
        }

        return totalFine;
    }
}

public class LibraryFine {
    public static void main(String[] args) {

        LibraryBook b = new LibraryBook();

        b.setBookName("Java Programming");
        b.setDaysLate(15);
        b.setFinePerDay(10);

        System.out.println("Book : " + b.getBookName());
        System.out.println("Fine : " + b.getTotalFine());
    }
}