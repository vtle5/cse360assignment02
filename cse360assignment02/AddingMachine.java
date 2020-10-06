/**
 * This package holds a AddingMachine class which
 * will be able to add and subtract while remembering the calculations
 *
 * @author  Vincent Le
 * @date    October 5, 2020
 */

package cse360assignment02;

public class AddingMachine {
    private int total;
    private String history;

    /**
     * This is the AddingMachine Constructor
     * It sets the total variable to 0 and history
     */
    public AddingMachine () {
        total = 0;  // not needed - included for clarity
        history = "0";
    }

    /**
     * This method returns the total variable
     * @return int This returns total
     */
    public int getTotal () {
        return total;
    }

    /**
     * This method adds to the total variable
     * @param value This variable is added to the total variable
     */
    public void add (int value) {
        total += value;
        history += " + " + value;
    }

    /**
     * This method subtracts from the total variable
     * @param value This variable subtracts from the total variable
     */
    public void subtract (int value) {
        total -= value;
        history += " - " + value;
    }

    /**
     * This method returns the history of calculations in string format
     * @return string Returns the history
     */
    public String toString () {
        return history;
    }

    /**
     * This method clears the history of calculations while keeping the total
     */
    public void clear() {
        history = String.valueOf(total);
    }
}