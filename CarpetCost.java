
/**
 * Help Empire Today Carpet to calculate cost of carpetting a rectangular
 * room
 *
 * @author Justin Quach
 * @version v1.0
 * @since 11/22/2025
 */
public class CarpetCost
{
    private RoomSize size;
    private double costPerSqFt;
    /**
     * Standard constructor for CarpetCost
     * @param area RoomSize object that manages the area of room
     * @param cost CostPerSqFt of carpetting
     */
    public CarpetCost(RoomSize area, double cost) {
        size = new RoomSize(area);
        costPerSqFt = cost;
    }
    /**
     * Calculates the cost to replace the carpet in the room
     * @return The cost to install the carpet for the entire room
     */
    public double getCost() {
        return this.size.getArea() * costPerSqFt;
    }
    /**
     * toString method for CarpetCost that makes everything looks nice
     * @return String representation of CarpetCost information, displays: 
     * name, length, width, cost/sqft, and total cost
     */
    @Override
    public String toString() {
        return String.format("%s\nThe cost per sq ft is: $%.2f\n" + 
                            "The total cost is: $%.2f", this.size.toString(),
                            this.costPerSqFt, this.getCost());
    }
}