import work3.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Main class for demonstrating the Observer pattern with a relational table representation.
 */
public class Main {
    public static void main(String[] args) {
        // Create an instance of ConcreteTable (representing a relational table)
        ConcreteTable table = new ConcreteTable();

        // Create instances of ConcreteTrigger (representing triggers/observers)
        Observer trigger1 = new ConcreteTrigger("Trigger1");
        Observer trigger2 = new ConcreteTrigger("Trigger2");

        // Attach triggers to the table
        table.attach(trigger1);
        table.attach(trigger2);

        // Add a new row to the table
        List<String> newRow = new ArrayList<>();
        newRow.add("Value1");
        newRow.add("Value2");
        table.addRow(newRow);

        // Update a cell in the table
        table.updateCell(0, 1, "UpdatedValue2");

        // Remove a row from the table
        table.removeRow(0);
    }
}

