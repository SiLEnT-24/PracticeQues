class StudentAdmission {
    String college;
    String studentName;
    String course;

    {
        college = "ABC College";
        System.out.println("Admission Process Started");
    }

    StudentAdmission() {
        this("Unknown", "Not Assigned");
    }

    StudentAdmission(String studentName) {
        this(studentName, "Not Assigned");
    }

    StudentAdmission(String studentName, String course) {
        this.studentName = studentName;
        this.course = course;

        System.out.println("College: " + college);
        System.out.println("Student: " + studentName);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {
        new StudentAdmission("Neha", "MCA");
    }
}