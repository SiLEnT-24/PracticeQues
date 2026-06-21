public class CourseStudent {
    private String studentName;
    private String courseName;
    private double courseFee;
    private double discountPercent;

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseFee(double courseFee) {
        this.courseFee = courseFee;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getCourseName() {
        return courseName;
    }

    public double getFinalFee() {
        return courseFee - (courseFee * discountPercent / 100);
    }

    public static void main(String[] args) {
        CourseStudent s = new CourseStudent();

        s.setStudentName("Alok");
        s.setCourseName("Java");
        s.setCourseFee(10000);
        s.setDiscountPercent(20);

        System.out.println("Student Name: " + s.getStudentName());
        System.out.println("Course Name: " + s.getCourseName());
        System.out.println("Final Fee: " + s.getFinalFee());
    }
}
