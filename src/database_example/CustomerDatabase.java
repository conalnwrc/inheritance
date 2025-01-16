package database_example;

import java.util.ArrayList;
import java.util.List;

public class CustomerDatabase implements DatabaseOperations, LogActions {
    private final List<String> customers = new ArrayList<>();

    @Override
    public void write(String record) {
        customers.add(record);
        System.out.println("Customer added: " + record);
    }

    @Override
    public String read() {
        return String.join(", ", customers);
    }

    @Override
    public void logAction(String action) {
        System.out.println("CustomerDB Log: " + action);
    }
}
