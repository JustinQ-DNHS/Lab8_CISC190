/**
 * The {@code FuelGuage} class simulates a car's fuel gauge. It tracks the
 * current amount of fuel in gallons and provides methods for increasing,
 * decreasing, and retrieving the fuel level. A fuel gauge can hold a maximum
 * of 15 gallons.
 *
 * @author Justin Quach
 * @version v1.0
 * @since 11/22/2025
 */
public class FuelGuage
{
    private final static int MAX_FUEL = 15;
    private int currentFuel;

    /**
     * Constructs a FuelGuage with the specified initial fuel amount.
     *
     * @param currentFuel the starting amount of fuel in gallons
     */
    public FuelGuage(int currentFuel) {
        this.currentFuel = currentFuel;
    }

    /**
     * Copy constructor. Creates a new FuelGuage containing the same
     * fuel level as the provided FuelGuage
     *
     * @param other the {@code FuelGuage} to copy
     */
    public FuelGuage(FuelGuage other) {
        currentFuel = other.currentFuel;
    }

    /**
     * Default constuctor, constructs a FuelGuage with a full tank (15 gallons).
     */
    public FuelGuage() {
        currentFuel = MAX_FUEL;
    }

    /**
     * Completely fills the fuel tank to its maximum capacity of 15 gallons.
     */
    public void fillTank() {
        currentFuel = MAX_FUEL;
    }

    /**
     * Increases the fuel level by 1 gallon, up to the maximum capacity of
     * 15 gallons.
     */
    public void addFuel() {
        if (currentFuel < MAX_FUEL) {
            currentFuel++;
        }
    }

    /**
     * Decreases the fuel level by 1 gallon if fuel remains. This simulates
     * burning fuel during vehicle operation.
     *
     * @return true if fuel was successfully used; false if no fuel remains
     */
    public boolean useFuel() {
        if (currentFuel > 0) {
            currentFuel--;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Returns the current amount of fuel in gallons.
     *
     * @return the current fuel level
     */
    public int getFuel() {
        return currentFuel;
    }

    /**
     * Returns a string representation of the fuel gauge, showing the current
     * fuel level in gallons.
     *
     * @return a formatted string describing the fuel level
     */
    @Override
    public String toString() {
        return "Current fuel: " + currentFuel;
    }
}
