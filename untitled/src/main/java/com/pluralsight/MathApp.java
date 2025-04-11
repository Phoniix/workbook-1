package com.pluralsight;

public class MathApp {

    public static void main(String[] args) {
    // Question 1:
    // declare variables here
        double bobSalary = 50000;
        double garySalary = 200000.99;
        double highestSalry = 0;
    // then code solution
        highestSalry = Math.max(bobSalary, garySalary);
    // then use System.out.println() to display results
    // ex: System.out.println("The answer is " + answer);
        System.out.println(" ");
        System.out.println("Question 1 Solution");
        System.out.println("The Highest Salary is: $" + highestSalry);
    // REPEAT FOR NEXT EXERCISE

        //Question 2
        double carPrice = 2005.24;
        double truckPrice = 3002.23;

        double smallestPrice = Math.min(carPrice, truckPrice);
        System.out.println(" ");
        System.out.println("Question 2 Solution");
        System.out.println("The Smaller Cost is: $" + smallestPrice);
        System.out.println(" ");

        //Question 3
        double pi = 3.14;
        double circleRadius = 7.25;
        // Area = PI * R^2

        double circleArea = pi * Math.pow(circleRadius, 2);
        System.out.println("Question 3 Solution");
        System.out.printf("The Area is: %.2f", circleArea, "units^2");
        System.out.println(" ");

        //Question 4
        double squareRoot = 5.0;
        double answer = Math.sqrt(5.0);
        System.out.println(" ");
        System.out.println("Question 4 Solution");
        System.out.printf("The square root is: %.2f", answer);
        System.out.println(" ");

        //Question 5
        int firstX = 5;
        int firstY = 10;
        int secondX = 85;
        int secondY = 50;
        // D = SQRT( (X2 - X1)^2 + (Y2 - Y1)^2 )

        double result = Math.sqrt(Math.pow((secondX - firstX), 2) + Math.pow((secondY - firstY), 2));
        System.out.println(" ");
        System.out.println("Question 5 Solution");
        System.out.printf("The Distance is: %.4f", result);
        System.out.println(" ");

        //Question 6
        double value1 = -3.8;
        double value1Absolute = Math.abs(value1);

        System.out.println(" ");
        System.out.println("Question 6 Solution");
        System.out.println("The absolute value of value1 is: " + value1Absolute);

        //Question 7
        double randomNum = Math.random();

        System.out.println(" ");
        System.out.println("Question 7 Solution");
        System.out.printf("Your randomly generated number between 0 & 1 is: %.3f", randomNum);
    }
}

