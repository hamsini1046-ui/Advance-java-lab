import java.util.Scanner;

public class AreaCalculator {

    static double circleArea(double r) {
        return Math.PI * r * r;
    }

    static double triangleArea(double b, double h) {
        return 0.5 * b * h;
    }

    static double squareArea(double s) {
        return s * s;
    }

    static double rectangleArea(double l, double b) {
        return l * b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Circle");
            System.out.println("2. Triangle");
            System.out.println("3. Square");
            System.out.println("4. Rectangle");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter radius: ");
                    double r = sc.nextDouble();
                    System.out.println("Area = " + circleArea(r));
                    break;

                case 2:
                    System.out.print("Enter base: ");
                    double base = sc.nextDouble();
                    System.out.print("Enter height: ");
                    double height = sc.nextDouble();
                    System.out.println("Area = " + triangleArea(base, height));
                    break;

                case 3:
                    System.out.print("Enter side: ");
                    double side = sc.nextDouble();
                    System.out.println("Area = " + squareArea(side));
                    break;

                case 4:
                    System.out.print("Enter length: ");
                    double length = sc.nextDouble();
                    System.out.print("Enter breadth: ");
                    double breadth = sc.nextDouble();
                    System.out.println("Area = " + rectangleArea(length, breadth));
                    break;

                case 5:
                    System.out.println("Program terminated");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 5);

        sc.close();
    }
}
