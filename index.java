/*
* This is a program that calculates the energy released when
* an object of a certain mass is converted to energy.
*
* @author  Curtis Edwards
* @version 1.0
* @since   2024-02-21
*/

import java.util.Scanner;

/**
* This is the standard "LogTruck" program.
*/
final class EnergyReleased {

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this is ever called
    *
    * @throws IllegalStateException if this is ever called
    *
    */
    private EnergyReleased() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // This method of getting user input was generated by ChatGPT

        // Create a Scanner object to read user input
        final Scanner scanner = new Scanner(System.in);

        boolean validInput = false;
        final double speedOfLight = 2.99e8;
        float objectMass = 0.0f;

        // check if input is valid
        try {
            System.out.print("Enter the mass of an object(kg): ");
            final String objectMassString = scanner.nextLine().trim();
            if (objectMassString.isEmpty()) {
                System.out.println("Invalid input.");
            } else {
                objectMass = Float.parseFloat(objectMassString);
                validInput = true;
            }
        } catch (NumberFormatException ex) {
            System.out.println("Invalid input");
        }

        // process
        if (validInput) {
            final double energyReleased =
                objectMass * Math.pow(speedOfLight, 2);
            System.out.print(objectMass + " kg of mass would produce ");
            System.out.print(String.format("%.3e", energyReleased));
            System.out.println(" J of energy");
        }

        scanner.close();

        System.out.println("\nDone.");
    }
}
