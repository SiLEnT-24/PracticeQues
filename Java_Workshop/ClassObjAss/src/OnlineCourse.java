class CourseStudent {

    private String studentName;
    private String courseName;
    private double courseFee;
    private double discountPercent;

    public void setStudentName(String name) {
        studentName = name;
    }

    public void setCourseName(String course) {
        courseName = course;
    }

    public void setCourseFee(double fee) {
        courseFee = fee;
    }

    public void setDiscountPercent(double discount) {
        discountPercent = discount;
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
}

public class OnlineCourse {

    public static void main(String[] args) {

        CourseStudent s = new CourseStudent();

        s.setStudentName("Harsh");
        s.setCourseName("Java");
        s.setCourseFee(10000);
        s.setDiscountPercent(20);

        System.out.println("Student Name : " + s.getStudentName());
        System.out.println("Course Name : " + s.getCourseName());
        System.out.println("Final Fee : " + s.getFinalFee());
    }
}