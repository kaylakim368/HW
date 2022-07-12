import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // Output the prompt
        // System.out.println("Enter a line of text: ");

        // System.out.println("Enter an integer: ");

        System.out.println("Enter a floating point value: ");

        // Wait for the user to enter a line of text
        // String line = input.nextLine();

        // int value = input.nextInt();

        double value = input.nextDouble();

        // Tell them what they entered
        // System.out.println("You entered: " + line);

        System.out.println("You entered: " + value);
    }
}