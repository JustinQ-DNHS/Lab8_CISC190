import java.util.Scanner;
/**
 * Demonstation of CarpetCost class
 *
 * @author Justin Quach
 * @version v1.0
 * @since 11/22/2025
 */
public class CarpetCostDemo
{
    public static void main(String args[]) {
        String name;
        double length, width, cost;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Room Name: ");
        name = input.nextLine();
        System.out.print("Enter room length: ");
        length = input.nextDouble();
        System.out.print("Enter room width: ");
        width = input.nextDouble();
        System.out.print("Enter cost per sq ft: ");
        cost = input.nextDouble();
        System.out.println();
        // Just want to seperate idk
        RoomSize temp = new RoomSize(name, length, width);
        CarpetCost masterRoom = new CarpetCost(temp, cost);
        System.out.println(masterRoom);
        System.out.println();
        // Next one!
        String var = input.nextLine();
        System.out.print("Enter Room Name: ");
        name = input.nextLine();
        System.out.print("Enter room length: ");
        length = input.nextDouble();
        System.out.print("Enter room width: ");
        width = input.nextDouble();
        System.out.print("Enter cost per sq ft: ");
        cost = input.nextDouble();
        System.out.println();
        // Start the stats
        CarpetCost livingRoom = new CarpetCost(new RoomSize(
                                            name, length, width), cost);
        System.out.println(livingRoom);
    }
}