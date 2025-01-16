package database_example;

public class Main {
    public static void main(String[] args) {
        DatabaseOperations customerDB = new CustomerDatabase();
        DatabaseOperations employeeDB = new EmployeeDatabase();

        System.out.println("--- Customer Database Operations ---");
        performDatabaseOperations(customerDB, "Alice");
        performDatabaseOperations(customerDB, "Bob");

        System.out.println("\n--- Employee Database Operations ---");
        performDatabaseOperations(employeeDB, "Charlie");
        performDatabaseOperations(employeeDB, "Dana");
    }

    public static void performDatabaseOperations(DatabaseOperations db, String record) {
        db.write(record);
        System.out.println("Current Records: " + db.read());

        if (db instanceof LogActions) {
            ((LogActions) db).logAction("Processed record: " + record);
        } else {
            System.out.println("Logging not supported for this database.");
        }
    }
}
