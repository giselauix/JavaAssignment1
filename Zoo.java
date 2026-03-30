
import java.util.Scanner;

public class Zoo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter animal name: ");
        String name = input.nextLine();

        System.out.print("Enter animal color: ");
        String color = input.nextLine();

        // Validation loop for age
        int age;
        while (true) {
            System.out.print("Enter animal age: ");
            age = input.nextInt();

            if (age >= 0) {
                break; // valid input
            } else {
                System.out.println("❌ Age cannot be negative. Please try again.");
            }
        }
        input.nextLine(); // clear buffer

        System.out.print("Enter animal favorite food: ");
        String favFood = input.nextLine();

        // Create Animal object
        Animal animal1 = new Animal(name, color, age, favFood);

        // Print details
        System.out.println("\n--- Animal Information ---");
        animal1.printDetails();

        input.close();
    } // main
} // class