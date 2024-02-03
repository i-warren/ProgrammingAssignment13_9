/**
 *  This creates two different Circle objects with a radius of 4.5
 *  It then prints the result of calling the overridden equals and compareTo methods
 * @author Isaac Warren
 */
public class Assignment13_9 {

    public static void main(String[] args) {
        // Creates two circles with radius of 4.5
        Circle object1 = new Circle(4.5);
        Circle object2 = new Circle(4.5);

        System.out.println(object1.equals(object2));    // uses overridden equals method on Circle objects

        System.out.println(object1.compareTo(object2)); // uses overridden compareTo method to compare Circle objects
    }
}
