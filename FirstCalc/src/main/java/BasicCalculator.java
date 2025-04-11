import java.util.Scanner;

public class BasicCalculator {
Scanner scanner = new Scanner(System.in);


    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in); //Introduce Scanner to local method
        System.out.println("Enter Your First Number:");
        double firstUserInput = Double.parseDouble(scanner.nextLine()); //User Input here
        System.out.println(" ");
        System.out.println("Enter Your Second Number: ");
        double secondUserInput = Double.parseDouble(scanner.nextLine()); //User Input here

        System.out.println("Possible Calculations:"); //Listing possible operations
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");
        System.out.println(" ");
        char equationChoice = 0; //sets char to 0 before loop, so it has firstUserInput value

    while (equationChoice != 'A' || equationChoice != 'S' || equationChoice != 'M' || equationChoice != 'D') {
        System.out.print("Enter the character for the correspoding operation: ");
        String userInput = scanner.nextLine().toUpperCase(); //User Input here
        equationChoice = userInput.charAt(0); //Grabs first letter of UI and coverts it into char
        if (equationChoice == 'A') {
            double result = firstUserInput + secondUserInput;
            System.out.println(firstUserInput + "+" + secondUserInput + "= " + result);
            break;
        } else if (equationChoice == 'S') {
            double result = firstUserInput - secondUserInput;
            System.out.println(firstUserInput + "-" + secondUserInput + "= " + result);
            break;
        } else if (equationChoice == 'M') {
            double result = firstUserInput * secondUserInput;
            System.out.println(firstUserInput + "*" + secondUserInput + "= " + result);
            break;
        } else if (equationChoice == 'D') {
            double result = firstUserInput / secondUserInput;
            System.out.println(firstUserInput + "/" + secondUserInput + "= " + result);
            break;
        } else {
            System.out.println("Invalid Input " +equationChoice);
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
        }
    }

        System.out.println("Program Ends Here");
    }


}
