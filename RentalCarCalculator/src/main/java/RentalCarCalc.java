import java.util.Scanner;

public class RentalCarCalc {
    Scanner scanner = new Scanner(System.in);

    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        double basicRental = 29.99;
        int customerAge = 0;
        int rentalPeriodDays = 0;
        boolean wantETT = false;
        boolean wantGPS = false;
        boolean wantRoadAssist = false;


        System.out.println("Hello! Thank you for choosing Rental Car Company!");
        System.out.println("What date would you like to pickup? MM/DD/YYYY Format");
        String pickupDate = scanner.nextLine();

        System.out.println("\nHow many days do you need to rent for?");
        rentalPeriodDays = scanner.nextInt();

        System.out.println("\nWhat is your current age?");
        customerAge = scanner.nextInt();

        System.out.println("\nDo you want to add Electronic Toll Tag for $3.95/day?");
        System.out.println("(1) Yes");
        System.out.println("(2) No");
        int ettConvert = scanner.nextInt(); if (ettConvert == 1) {wantETT = true;}

        System.out.println("\nDo you want to add GPS for $2.95/day?");
        System.out.println("(1) Yes");
        System.out.println("(2) No");
        int gpsConvert = scanner.nextInt(); if (gpsConvert == 1) {wantGPS =true;}

        System.out.println("\nDo you want to add GPS for $2.95/day?");
        System.out.println("(1) Yes");
        System.out.println("(2) No");
        int roadAssistConvert = scanner.nextInt(); if (roadAssistConvert == 1) {wantRoadAssist =true;}

        System.out.println("You are set to pick up on: " + pickupDate);
        if (wantETT && wantGPS && wantRoadAssist) {
            RentalCarCalc.allTrue(rentalPeriodDays, customerAge);
        } else if (!wantETT && !wantGPS && !wantRoadAssist) {
            RentalCarCalc.allFalse(rentalPeriodDays, customerAge);
        } else {
            RentalCarCalc.mixedOptions(wantETT, wantGPS, wantRoadAssist, rentalPeriodDays, customerAge);
        }

        System.out.println("\nYou are set to pick up on: " + pickupDate);


    }

    static void allTrue (int rentalPeriodDays, int customerAge) {
        System.out.println("Awesome, you're completely decked out!");
        double ettCharge = 3.95 * rentalPeriodDays;
        double gpsCharge = 2.95 * rentalPeriodDays;
        double roadAssistCharge = 3.95 * rentalPeriodDays;
        double totalAddCharges = ettCharge + gpsCharge + roadAssistCharge;
        double totalRentalCost = 0;

        if( customerAge >= 25) {
            double basicRental = 29.99 * rentalPeriodDays;
            totalRentalCost += basicRental + totalAddCharges;
            System.out.println("\nHere is your total breakdown: ");
            System.out.println("Basic rental: $" + basicRental);
            System.out.println("Total Additional/Optional Charges: $" + totalAddCharges);
            System.out.println("Electronic Toll Tag @ $3.95/day: $" + ettCharge);
            System.out.println("GPS @ $2.95/day: $" + gpsCharge);
            System.out.println("Roadside Assistance @ $3.95/day: $" + roadAssistCharge);
            System.out.println("Total Cost: $" + totalRentalCost);
        } else {
            double basicRental = 38.987;
            totalRentalCost += basicRental + totalAddCharges;
            System.out.println("\nHere is your total breakdown: ");
            System.out.println("Basic rental (Including 30% Underage Surcharge): $" + totalRentalCost);
            System.out.println("Total Additional/Optional Charges: $" + totalAddCharges);
            System.out.println("Electronic Toll Tag @ $3.95/day: $" + ettCharge);
            System.out.println("GPS @ $2.95/day: $" + gpsCharge);
            System.out.println("Roadside Assistance @ $3.95/day: $" + roadAssistCharge);
            System.out.println("Total Cost: $" + totalRentalCost);
        }
    } //Method 1 (All Options)

    static void allFalse (int rentalPeriodDays, int customerAge) {
        System.out.println("You have chosen the minimum price rental.");
        double totalRentalCost = 0;

        if (customerAge >= 25) {
            double basicRental =29.99;
            totalRentalCost += basicRental * rentalPeriodDays;
            System.out.println("\nHere is your total breakdown: ");
            System.out.println("Basic rental: $" + totalRentalCost);
            System.out.println("Total Additional/Optional Charges: $0.00");
            System.out.println("Electronic Toll Tag @ $3.95/day: $0.00");
            System.out.println("GPS @ $2.95/day: $0.00");
            System.out.println("Roadside Assistance @ $3.95/day: $0.00");
            System.out.println("Total Cost: $" + totalRentalCost);
        } else {
            double basicRental = 38.987;
            totalRentalCost += basicRental * rentalPeriodDays;
            System.out.println("\nHere is your total breakdown: ");
            System.out.println("Basic rental (Including 30% Underage Surcharge): " + totalRentalCost);
            System.out.println("Total Additional/Optional Charges: $0.00");
            System.out.println("Electronic Toll Tag @ $3.95/day: $0.00");
            System.out.println("GPS @ $2.95/day: $0.00");
            System.out.println("Roadside Assistance @ $3.95/day: $0.00");

            System.out.println("Total Cost: $" + totalRentalCost);
        }
    }//Method 2 (No Extras)

    static void mixedOptions (Boolean wantETT, Boolean wantGPS, Boolean wantRoadAssist, int rentalPeriodDays, int customerAge) {
        System.out.println("Great! You have chosen 1 or more protections!");
        double totalRentalCost = 0;
        double totalAddCharges = 0;
        double ettCharge =0;
        double gpsCharge = 0;
        double roadAssistCharge = 0;

        if (customerAge >= 25) {
            double basicRental = 29.99;
            totalRentalCost += basicRental*rentalPeriodDays;
            System.out.println("\n Here is your total cost breakdown: ");
            System.out.println("Basic Rental: $" + totalRentalCost);
            if (wantETT) {
                totalRentalCost += 3.95 * rentalPeriodDays;
                totalAddCharges += 3.95 * rentalPeriodDays;
                ettCharge = 3.95 * rentalPeriodDays;
            } if (wantGPS) {
                totalRentalCost += 2.95 * rentalPeriodDays;
                totalAddCharges += 2.95 * rentalPeriodDays;
                gpsCharge = 2.95 *rentalPeriodDays;
            } if (wantRoadAssist) {
                totalRentalCost += 3.95 * rentalPeriodDays;
                totalAddCharges += 3.95 * rentalPeriodDays;
                roadAssistCharge = 3.95 * rentalPeriodDays;
            }
            System.out.println("Total Additional/Optional Charges: $" + totalAddCharges);
            System.out.println("Electronic Toll Tag @ $3.95/day: $" + ettCharge);
            System.out.println("GPS @ $2.95/day: $" + gpsCharge);
            System.out.println("Roadside Assistance @ $3.95/day: $" + roadAssistCharge);
            System.out.println("Total Cost: $" + totalRentalCost);
        } else {
            double basicRental = 38.987;
            totalRentalCost += basicRental*rentalPeriodDays;
            System.out.println("\n Here is your total cost breakdown: ");
            System.out.println("Basic Rental (Including 30% Underage Surcharge: $" + totalRentalCost);
            if (wantETT) {
                totalRentalCost += 3.95 * rentalPeriodDays;
                totalAddCharges += 3.95 * rentalPeriodDays;
                ettCharge = 3.95 * rentalPeriodDays;
            } if (wantGPS) {
                totalRentalCost += 2.95 * rentalPeriodDays;
                totalAddCharges += 2.95 * rentalPeriodDays;
                gpsCharge = 2.95 *rentalPeriodDays;
            } if (wantRoadAssist) {
                totalRentalCost += 3.95 * rentalPeriodDays;
                totalAddCharges += 3.95 * rentalPeriodDays;
                roadAssistCharge = 3.95 * rentalPeriodDays;
            }
            System.out.println("Total Additional/Optional Charges: $" + totalAddCharges);
            System.out.println("Electronic Toll Tag @ $3.95/day: $" + ettCharge);
            System.out.println("GPS @ $2.95/day: $" + gpsCharge);
            System.out.println("Roadside Assistance @ $3.95/day: $" + roadAssistCharge);
            System.out.println("Total Cost: $" + totalRentalCost);
        }
    }
}
