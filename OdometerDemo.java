/**
 * Write a description of class OdometerDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OdometerDemo
{
    public static void main(String[] args) {
        FuelGuage fuel1 = new FuelGuage(6);
        Odometer car1 = new Odometer(1000, fuel1);
        // Lots of words
        System.out.println("Car1 gas level: " + car1.getFuel());
        System.out.println();
        car1.fillGas();
        System.out.println("Car1 is filling up");
        System.out.println();
        System.out.println("Car1 gas level: " + car1.getFuel());
        System.out.println();
        System.out.println("Car1 is off");
        System.out.println();
        System.out.println("-----------");
        while (car1.hasFuel()) {
            car1.drive();
        }
        FuelGuage fuel2 = new FuelGuage(8);
        Odometer car2 = new Odometer(999850, fuel2);
        // Lots of words
        System.out.println("Car2 gas level: " + car2.getFuel());
        System.out.println();
        car2.fillGas();
        System.out.println("Car2 is filling up");
        System.out.println();
        System.out.println("Car2 gas level: " + car2.getFuel());
        System.out.println();
        System.out.println("Car2 is off");
        System.out.println();
        System.out.println("-----------");
        while (car2.hasFuel()) {
            car2.drive();
        }
    }
}