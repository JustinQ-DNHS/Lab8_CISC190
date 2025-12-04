/**
 * The Odometer class simulates a car's odometer and works together with a
 * FuelGuage object to model fuel consumption. The odometer tracks mileage,
 * increments it as the vehicle "drives," and signals when fuel should be
 * consumed based on miles traveled. The odometer rolls over to 0 after
 * reaching 999,999 miles.
 *
 * It consumes 1 gallon of fuel for every 24 miles traveled.
 * The class supports incrementing mileage, checking fuel availability,
 * refilling fuel, and retrieving mileage and fuel information.
 *
 * @author Justin Quach
 * @version v1.0
 * @since 11/22/2025
 */
public class Odometer
{
    private final static int MAX_MILEAGE = 999999; //999,999
    private final static int MILES_PER_GALLON = 24;
    private int mileage;
    private int milesPerGallon = 0;
    private FuelGuage fuel;

    /**
     * Constructs an Odometer with the given starting mileage and a FuelGuage.
     * The mileage is wrapped to remain within the allowable range (0–999,999).
     * A deep copy of the provided FuelGuage is created.
     *
     * @param mileage the starting mileage
     * @param object the FuelGuage to associate with this odometer
     */
    public Odometer(int mileage, FuelGuage object) {
        this.mileage = mileage % MAX_MILEAGE;
        fuel = new FuelGuage(object);
    }

    /**
     * Constructs an Odometer with mileage set to 0 and a FuelGuage copied
     * from the provided object.
     *
     * @param object the FuelGuage to associate with this odometer
     */
    public Odometer(FuelGuage object) {
        mileage = 0;
        fuel = new FuelGuage(object);
    }

    /**
     * Simulates driving the vehicle for 1 mile. Mileage is incremented by one,
     * rolling over to 0 when the maximum value is reached. The odometer tracks
     * how many miles have been driven since the last gallon of fuel was used.
     *
     * After 24 miles, the odometer attempts to consume 1 gallon of fuel.
     * If fuel runs out, a message is printed instead of advancing mileage.
     */
    public void drive() {
        if (++milesPerGallon < MILES_PER_GALLON) {
            mileage = (mileage < MAX_MILEAGE) ? mileage += 1 : 0;
            System.out.println(this);
        } else {
            if (fuel.useFuel()) {
                milesPerGallon = 0;
                mileage = (mileage < MAX_MILEAGE) ? mileage += 1 : 0;
                System.out.println(this);
            } else {
                System.out.println("Out of gas!");
            }
        }
    }

    /**
     * Refills the associated FuelGuage to its maximum capacity and resets
     * the miles-per-gallon counter used for tracking fuel consumption.
     */
    public void fillGas() {
        fuel.fillTank();
        milesPerGallon = 0;
    }

    /**
     * Determines whether there is any fuel remaining.
     *
     * @return true if fuel is available; false otherwise
     */
    public boolean hasFuel() {
        return fuel.getFuel() > 0;
    }

    /**
     * Returns the current amount of fuel remaining.
     *
     * @return the number of gallons of fuel left
     */
    public int getFuel() {
        return fuel.getFuel();
    }

    /**
     * Returns the current mileage stored on the odometer.
     *
     * @return the mileage value
     */
    public int getMileage() {
        return mileage;
    }

    /**
     * Returns a formatted string containing the odometer's current mileage
     * and remaining fuel.
     *
     * @return a string representation of this odometer
     */
    @Override
    public String toString() {
        return String.format("Mileage: \t%d, Fuel (Gal Left): %d",
                            mileage, fuel.getFuel()
                            );
    }
}
