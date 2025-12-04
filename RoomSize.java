
/**
 * Manages room size for CarpetCost class assuming rooms are rectangular
 *
 * @author Justin Quach
 * @version v1.0
 * @since 11/22/2025
 */
public class RoomSize
{
    private String name;
    private double length, width;
    /**
     * Standard constructor for RoomSize object
     * @param inName Name of room
     * @param inLen Length of room
     * @param inWidth Width of room
     */
    public RoomSize(String inName, double inLen, double inWidth) {
        name = inName;
        length = inLen;
        width = inWidth;
    }
    /**
     * Copy constructor for RoomSize class
     * @param object2 RoomSize to copy
     */
    public RoomSize(RoomSize object2) {
        name = object2.name;
        length = object2.length;
        width = object2.width;
    }
    /**
     * Area calculator for RoomSize class instance
     * @return The area of the room defined in RoomSize instance
     */
    public double getArea() {
        return length * width;
    }
    /**
     * toString method for RoomSize class
     * @return Formatted string that displays: name, width, length, and area
     * of RoomSize instance
     */
    @Override
    public String toString() {
        return String.format("Room Name: %s\nLength: %,.1f\nWidth: %,.1f\n" +
                            "Area: %,.2f", name, length, width, getArea()
                            );
    }
}