class StudentResult {

    private String studentName;
    private int mathMarks;
    private int scienceMarks;
    private int englishMarks;

    public void setStudentName(String name) {
        studentName = name;
    }

    public void setMathMarks(int marks) {
        mathMarks = marks;
    }

    public void setScienceMarks(int marks) {
        scienceMarks = marks;
    }

    public void setEnglishMarks(int marks) {
        englishMarks = marks;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getTotalMarks() {
        return mathMarks + scienceMarks + englishMarks;
    }

    public double getAverage() {
        return getTotalMarks() / 3.0;
    }

    public String getGrade() {

        double avg = getAverage();

        if (avg >= 90)
            return "A";
        else if (avg >= 75)
            return "B";
        else if (avg >= 50)
            return "C";
        else
            return "Fail";
    }
}

public class SchoolResult {
    public static void main(String[] args) {

        StudentResult s = new StudentResult();

        s.setStudentName("Harsh");
        s.setMathMarks(90);
        s.setScienceMarks(85);
        s.setEnglishMarks(95);

        System.out.println("Name : " + s.getStudentName());
        System.out.println("Total : " + s.getTotalMarks());
        System.out.println("Average : " + s.getAverage());
        System.out.println("Grade : " + s.getGrade());
    }
}