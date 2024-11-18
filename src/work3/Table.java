package work3;

import java.util.ArrayList;
import java.util.List;

/**
 * Table is an abstract class representing a relational table with observer support.
 * It allows attaching and detaching observers, and notifying them of changes.
 */
public abstract class Table {
    private List<Observer> observers = new ArrayList<>();

    /**
     * Attaches an observer to the table.
     *
     * @param observer The observer to be attached.
     */
    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * Detaches an observer from the table.
     *
     * @param observer The observer to be detached.
     */
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Notifies all attached observers of a change in the table.
     *
     * @param action The action that was performed (e.g., "Row added", "Cell updated").
     * @param row    The row index where the change occurred.
     * @param column The column index where the change occurred, or -1 if not applicable.
     * @param value  The new value after the change, or null if not applicable.
     */
    protected void notifyObservers(String action, int row, int column, String value) {
        for (Observer observer : observers) {
            observer.update(action, row, column, value);
        }
    }
}
