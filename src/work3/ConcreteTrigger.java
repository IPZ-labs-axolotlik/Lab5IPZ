package work3;

/**
 * ConcreteTrigger represents a specific observer (trigger) that reacts to changes in the ConcreteTable.
 */
public class ConcreteTrigger implements Observer {
    private String triggerName;

    /**
     * Constructor for creating a new trigger with a given name.
     *
     * @param triggerName The name of the trigger.
     */
    public ConcreteTrigger(String triggerName) {
        this.triggerName = triggerName;
    }

    /**
     * Called when the observed table changes, performing an action based on the change.
     *
     * @param action The action that was performed (e.g., "Row added", "Cell updated").
     * @param row    The row index where the change occurred.
     * @param column The column index where the change occurred, or -1 if not applicable.
     * @param value  The new value after the change, or null if not applicable.
     */
    @Override
    public void update(String action, int row, int column, String value) {
        String location = (column == -1) ? "row " + row : "cell [" + row + ", " + column + "]";
        System.out.println("Trigger [" + triggerName + "] performed action: " + action + " on " + location +
                (value != null ? " with value: " + value : ""));
    }
}

