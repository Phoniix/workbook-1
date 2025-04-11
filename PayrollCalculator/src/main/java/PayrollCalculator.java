import java.util.Scanner;

public class PayrollCalculator {
    Scanner scanner = new Scanner(System.in); // Introduce Scanner

    public static void main (String[] args) {
        PayrollCalculator.entirePayrollCalc();
    }










//--------------------------------------------------------------------------------------------------------------------------- //

// Methods for the PayrollCalculator
    // Method 1

    static double grossPayCalcMethod (double payRate, double hoursWorked) {
        double grossRegPay = payRate * hoursWorked; // Hours times payrate

        System.out.println("Based on " + hoursWorked + " hours. At " + payRate + " per/hour, is equal to: $" + grossRegPay);
        return grossRegPay;
    }

//--------------------------------------------------------------------------------------------------------------------------- //
    // Method 2

    static double overTimeCalcMethod (double payRate, double hoursWorked) {
        double regularHours = 40; //Regular hours = 40, since this method only applies IF there is overtime
        double regularPay = payRate; //regular payrate with no changes

        double overTimeHours = hoursWorked - regularHours; //separates how many hours are overtime vs regular
        double overTimePay = 1.5 * payRate; //1.5 times the payrate to multiply with overtime hours


        double grossOTPay = 0;

        grossOTPay = (regularHours * regularPay) + (overTimeHours * overTimePay);
        System.out.println("Based on " + hoursWorked + " hours. At " + payRate + " per/hour, is equal to: $" + grossOTPay);

        return grossOTPay;


    }

//--------------------------------------------------------------------------------------------------------------------------- //
    //Method 3

    static double entirePayrollCalc() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("Enter your name: ");
        String employeeName = scanner.nextLine(); //Employee Name Input

        System.out.println(" ");
        System.out.println(" Enter your hours worked: ");
        double hoursWorked = Double.parseDouble(scanner.nextLine()); //Employee's jours worked input

        System.out.println(" ");
        System.out.println("Enter your pay rate per/hour: ");
        double payRate = Double.parseDouble(scanner.nextLine()); //Employee's pay rate input

        double grossPay = 0.0;

        System.out.println(" ");
        System.out.println("Hello, " + employeeName + "!");

        if (hoursWorked > 40) {
            grossPay = PayrollCalculator.overTimeCalcMethod(payRate, hoursWorked);

        } else {
            grossPay = PayrollCalculator.grossPayCalcMethod(payRate, hoursWorked);
        }

        return grossPay;
    }
}
