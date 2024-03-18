import java.util.Scanner;

public class Lab2q2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert your first number:");
        float firstNumber = scanner.nextInt(); // Read the first integer input from the user

        System.out.println("Insert your second number:");
        float secondNumber = scanner.nextInt(); // Read the second integer input from the user

        float sum = firstNumber + secondNumber; // Calculate the sum of the two numbers

        System.out.println("The sum of the two values is: " + sum);

        scanner.close(); // Close the Scanner object to prevent resource leak
    }
}
