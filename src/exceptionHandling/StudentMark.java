package exceptionHandling;

public class StudentMark {
    private String studentName;
    private int examMark;

    public StudentMark(String studentName, int examMark) throws StudentException {
        this.setStudentname(studentName);  // Validate the student name
        this.setExamMark(examMark);  // Validate the exam mark
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentname(String studentName) throws StudentException {
        if (studentName == null || studentName.length() < 3) {
            throw new StudentException("Student name must be at least 3 characters long.");
        }
        this.studentName = studentName;
    }

    public int getExamMark() {
        return examMark;
    }

    public void setExamMark(int examMark) throws StudentException {
        if (examMark < 0 || examMark > 100) {
            throw new StudentException("Exam mark must be between 0 and 100.");
        }
        this.examMark = examMark;
    }

    public String grade() {
        if (examMark >= 90) {
            return "A";
        } else if (examMark >= 80) {
            return "B";
        } else if (examMark >= 70) {
            return "C";
        } else if (examMark >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
