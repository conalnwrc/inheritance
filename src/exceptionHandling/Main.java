package exceptionHandling;

public class Main {
    public static void main(String[] args) {

        try {
            // Create a student with valid data
            StudentMark s1 = new StudentMark("Mary Brown", 39);
            // Create a student with invalid data (mark > 100)
            StudentMark s2 = new StudentMark("Jean Brown", 110);  // This will throw an exception

            System.out.println(s1.grade());
            System.out.println(s2.grade());

            // Attempt to set invalid data (name too short)
            s1.setStudentname("Mar");  // This will also throw an exception

        } catch (StudentException e1) {
            // Catch custom exception and print custom message
            System.out.print(e1.toString());
        } catch (Exception e) {
            // Catch any other generic exceptions
            System.out.print("Error: " + e.getMessage());
        }
    }
}
