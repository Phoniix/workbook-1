import java.util.Scanner;

public class PayrollCalculator {
    Scanner scanner = new Scanner(System.in);

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("Enter your name: ");
        String employeeName = scanner.nextLine();
        System.out.println(" ");
        System.out.println(" Enter your hours worked: ");
        double hoursWorked = Double.parseDouble(scanner.nextLine());
        System.out.println(" ");
        System.out.println("Enter your pay rate per/hour: ");
        double payRate = Double.parseDouble(scanner.nextLine());
        double result = hoursWorked * payRate;

        System.out.println(" ");
        System.out.println("Hello, " + employeeName + "!");
        System.out.println("Based on " + hoursWorked + " hours. At " + payRate + " per/hour, is equal to: $" + result);
    }
}
