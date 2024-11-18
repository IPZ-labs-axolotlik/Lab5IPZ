package work3;

import java.util.ArrayList;
import java.util.List;

/**
 * ConcreteTable represents a relational table that supports operations like adding, updating, and removing rows.
 * It extends the abstract class Table and notifies attached observers (triggers) when changes occur.
 */
public class ConcreteTable extends Table {
    private List<List<String>> data = new ArrayList<>();

    /**
     * Adds a new row to the table and notifies observers.
     *
     * @param row The new row to be added, represented as a list of strings.
     */
    public void addRow(List<String> row) {
        data.add(row);
        notifyObservers("Row added", data.size() - 1, -1, null);
    }

    /**
     * Updates a specific cell in the table and notifies observers.
     *
     * @param row      The row index of the cell to be updated.
     * @param column   The column index of the cell to be updated.
     * @param newValue The new value to set in the specified cell.
     */
    public void updateCell(int row, int column, String newValue) {
        if (row >= 0 && row < data.size() && column >= 0 && column < data.get(row).size()) {
            data.get(row).set(column, newValue);
            notifyObservers("Cell updated", row, column, newValue);
        }
    }

    /**
     * Removes a row from the table and notifies observers.
     *
     * @param row The index of the row to be removed.
     */
    public void removeRow(int row) {
        if (row >= 0 && row < data.size()) {
            data.remove(row);
            notifyObservers("Row removed", row, -1, null);
        }
    }

    /**
     * Gets the current data in the table.
     *
     * @return A list of lists representing the rows of the table.
     */
    public List<List<String>> getData() {
        return data;
    }
}

