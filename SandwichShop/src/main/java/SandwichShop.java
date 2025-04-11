import java.util.Scanner;

public class SandwichShop {
    Scanner scanner = new Scanner(System.in);


    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        double regSandwich = 5.45;
        double largeSandwich = 8.95;
        double regLoadedSandwich = 6.45;
        double largeLoadedSandwich = 10.7;
        System.out.println("What is your age?");
        int customerAge = scanner.nextInt();

        System.out.println("\nWhat size sandwich would you like? Regular/Large");
        System.out.println("(1) Regular Sized");
        System.out.println("(2) Large Sized");
        int sandwhichSize = scanner.nextInt();

        System.out.println("\nWould you like a 'loaded' sandwich for an additional cost?");
        System.out.println("(1) Yes");
        System.out.println("(2) No");
        int loadedSandwich = scanner.nextInt();

        if (loadedSandwich == 1) {
            if (sandwhichSize == 1) {
                System.out.println("\nYou chose a regular 'loaded' sandwich!");
                if (customerAge >= 65) {
                    System.out.println("\nSince you're old, here's 20% off");
                    double totalCost = regLoadedSandwich * .8;
                    System.out.println("Your total is: $" + totalCost);
                } else if (customerAge <= 17) {
                    System.out.println("\nSince you're a wee baby, here's 10% off");
                    double totalCost = regLoadedSandwich * .9;
                    System.out.println("Your total is: $" + totalCost);
                } else {
                    double totalCost = regLoadedSandwich;
                    System.out.println("Your total is: $" + totalCost);
                }
            } else if (sandwhichSize == 2) {
                System.out.println("\nYou chose a large 'loaded' sandwich!");
                if (customerAge >= 65) {
                    System.out.println("\n Since you're old, here's 20% off");
                    double totalCost = largeLoadedSandwich * .8;
                    System.out.println("Your total is: $" + totalCost);
                } else if (customerAge <= 17) {
                    System.out.println("\n Since you're a wee baby, here's 10% off");
                    double totalCost = largeLoadedSandwich * .9;
                    System.out.println("Your total is: $" + totalCost);
                } else {
                    double totalCost = largeLoadedSandwich;
                    System.out.println("Your total is: $" + totalCost);
                }
            } else {
                System.out.println("Input not recognized");
            }
        } else {
            if (sandwhichSize == 1) {
                System.out.println("\nYou chose a regular sandwich!");
                if (customerAge >= 65) {
                    System.out.println("\nSince you're old, here's 20% off");
                    double totalCost = regSandwich * .8;
                    System.out.println("Your total is: $" + totalCost);
                } else if (customerAge <= 17) {
                    System.out.println("\nSince you're a wee baby, here's 10% off");
                    double totalCost = regSandwich * .9;
                    System.out.println("Your total is: $" + totalCost);
                } else {
                    double totalCost = regSandwich;
                    System.out.println("Your total is: $" + totalCost);
                }
            } else if (sandwhichSize == 2) {
                System.out.println("\nYou chose a large sandwich!");
                if (customerAge >= 65) {
                    System.out.println("\nSince you're old, here's 20% off");
                    double totalCost = largeSandwich * .8;
                    System.out.println("Your total is: $" + totalCost);
                } else if (customerAge <= 17) {
                    System.out.println("\nSince you're a wee baby, here's 10% off");
                    double totalCost = largeSandwich * .9;
                    System.out.println("Your total is: $" + totalCost);
                } else {
                    double totalCost = largeSandwich;
                    System.out.println("Your total is: $" + totalCost);
                }
            } else {
                System.out.println("Input not recognized");
            }
        }
    }

}

