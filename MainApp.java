import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        int choice;

        do {
            System.out.println("\nCalculator");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {

                System.out.print("Enter first number: ");
                int a = sc.nextInt();

                System.out.print("Enter second number: ");
                int b = sc.nextInt();

                if (choice == 1) {
                    System.out.println("Result: " + calc.add(a, b));
                } else if (choice == 2) {
                    System.out.println("Result: " + calc.subtract(a, b));
                } else if (choice == 3) {
                    System.out.println("Result: " + calc.multiply(a, b));
                } else if (choice == 4) {
                    double result = calc.divide(a, b);
                    if (b != 0) {
                        System.out.println("Result: " + result);
                    }
                }

            } else if (choice != 5) {
                System.out.println("Invalid choice");
            }

        } while (choice != 5);

        System.out.println("Exited");

        sc.close();
    }
}
