package exceptionHandling;

public class StudentException extends Exception {

    private String message;

    // Constructor that accepts a custom message
    public StudentException(String message) {
        this.message = message;
    }

    // Default constructor with a default message
    public StudentException() {
        this.message = "Invalid Data entered";
    }

    // Override toString to return the message with custom formatting
    @Override
    public String toString() {
        return "**My Student Exception: " + message;
    }
}
