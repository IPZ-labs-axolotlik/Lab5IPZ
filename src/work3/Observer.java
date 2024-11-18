package work3;

/**
 * Observer is an interface for objects that need to be notified of changes in a subject.
 */
public interface Observer {
    /**
     * Called to notify the observer of a change in the subject.
     *
     * @param action The action that was performed (e.g., "Row added", "Cell updated").
     * @param row    The row index where the change occurred.
     * @param column The column index where the change occurred, or -1 if not applicable.
     * @param value  The new value after the change, or null if not applicable.
     */
    void update(String action, int row, int column, String value);
}
