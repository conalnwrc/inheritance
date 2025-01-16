package database_example;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDatabase implements DatabaseOperations {
    private final List<String> employees = new ArrayList<>();

    @Override
    public void write(String record) {
        employees.add(record);
        System.out.println("Employee added: " + record);
    }

    @Override
    public String read() {
        return String.join(", ", employees);
    }
}
