public class results {
    private String studentName;
    private int mathMarks;
    private int scienceMarks;
    private int englishMarks;

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setMathMarks(int mathMarks) {
        this.mathMarks = mathMarks;
    }

    public void setScienceMarks(int scienceMarks) {
        this.scienceMarks = scienceMarks;
    }

    public void setEnglishMarks(int englishMarks) {
        this.englishMarks = englishMarks;
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

    public static void main(String[] args) {
        results s = new results();

        s.setStudentName("Alok");
        s.setMathMarks(90);
        s.setScienceMarks(85);
        s.setEnglishMarks(80);

        System.out.println("Student: " + s.getStudentName());
        System.out.println("Total: " + s.getTotalMarks());
        System.out.println("Average: " + s.getAverage());
        System.out.println("Grade: " + s.getGrade());
    }
}