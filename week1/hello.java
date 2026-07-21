import java.util.Scanner;

public class hello{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("   Welcome to the Advance Java Lab");
        System.out.println("====================================");

        System.out.print("\nEnter a message: ");
        String message = sc.nextLine();

        if (message.equalsIgnoreCase("hi")) {
            System.out.println("Hello");
        } else if (message.equalsIgnoreCase("bye")) {
            System.out.println("Bye");
        } else {
            System.out.println("I don't understand.");
        }

        System.out.println("\n----- Calculator -----");

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        switch (op) {
            case '+':
                System.out.println("Result = " + (num1 + num2));
                break;

            case '-':
                System.out.println("Result = " + (num1 - num2));
                break;

            case '*':
                System.out.println("Result = " + (num1 * num2));
                break;

            case '/':
                if (num2 != 0) {
                    System.out.println("Result = " + (num1 / num2));
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid operator.");
        }

        System.out.println("\nThanks for using the Calculator.");
        sc.close();
    }
}
