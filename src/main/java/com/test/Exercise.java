package com.test;
import java.util.Scanner;
public class Exercise {
    public void SimpleDisplay()
    {
        System.out.println("Hello");
        System.out.println("Sobia Bashir");
    }
    public void IsLeapYear(int year)
    {
        if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
        {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
    public void ArithmeticOperations(int num1, int num2) {
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient =  num1 / num2; // Need to cast to double for correct division

        // Print results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
    public int AverageCalculatorOFThreeNumbers(int num1,int num2,int num3)
    {
       return (num1+num2+num3)/3;
    }
    public void DisplayName()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your first name: ");
        String username = scanner.nextLine();
        System.out.println("Hello " + username + ".");

    }
    public void ArithmeticOperationsFromUser() {
        int num1,num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first operand: ");
        num1 = scanner.nextInt();
        System.out.print("Enter the second operand: ");
        num2 = scanner.nextInt();
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient =  num1 / num2;
        System.out.println("Here is output");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
    public void ConvertSecondsIntoHours(int inputInSecond)
    {
        int hours = inputInSecond/ 3600;
        // Calculate remaining seconds after removing hours
        int remainingSecondsAfterHours = inputInSecond % 3600;
        // Calculate minutes
        int minutes = remainingSecondsAfterHours / 60;
        // Calculate remaining seconds after removing minutes
        int seconds = remainingSecondsAfterHours % 60;

        System.out.printf("Expected output: %02d:%02d:%02d%n", hours, minutes, seconds);
    }


}
