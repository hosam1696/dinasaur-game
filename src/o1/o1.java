package o1;

import java.util.Scanner;

/**
 * Name: First Hand on It
 * Created by Hosam on 2/17/2019.
 */


public class o1 {

    public static void testClasses1() {
        Honda honda = new Honda();
        honda.changeColor(HondaColor.Grey);
        honda.move(CarDirection.Vertical, 30);

        System.out.println("Honda Car => " + honda.color);
    }

    public static void testClasses2() {
        Car kia = new Car(150, "Kia2019");

        kia.move(CarDirection.Horizontal, 24.5);
        kia.move(CarDirection.Vertical, 5.5);

        System.out.println("Kia Location > " + kia.location());
    }

    private static void useScanner() {
        System.out.println("Type your Name");
        Scanner scanner = new Scanner(System.in);

        String name = "Hosam Elnabawy"; //scanner.next();
        scanner.close();

        String[] myString = {"hosam", "elnabawy"};
        myString[0] = name;

        System.out.println(myString.length);
        System.out.println(name);
    }

    public static void main(String[] args) {
        // Get Name By Scanner
        useScanner();
        // Kia Car
        testClasses1();
        // Honda Car
        testClasses2();
    }


}
