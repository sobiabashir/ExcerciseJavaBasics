package com.test;
import java.util.Scanner;
public class App
{
    public static void main( String[] args )
    {
        char choice;
        int task;
        boolean contion= true;
        System.out.println("********************************************************************************");
        System.out.println("********************************************************************************");
        do{
            System.out.println();
            System.out.println("Here is the following option which you can select to perform a specific task :");
            System.out.println("1 for check question 1 :");
            System.out.println("Enter 2 for check question 2 :");
            System.out.println("Enter 3 for check question 3 :");
            System.out.println("Enter 4 for check question 4 :");
            System.out.println("Enter 5 for check question 5 :");
            System.out.println("Enter 6 for check question 6 :");
            System.out.println("Enter 7 for check question 7 :");
            System.out.println("Enter 8 for check question 8 :");
            Exercise ExerciseObj=new Exercise();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter your choice :");
            task = scanner.nextInt();
            switch (task)
            {
                case 1:
                    ExerciseObj.SimpleDisplay();
                    break;
                case 2:
                    int y;
                    System.out.println("Enter the year to check is it leap year or not ");
                    y=scanner.nextInt();
                    System.out.println();
                    ExerciseObj.IsLeapYear(y);
                    break;
                case 3:
                    ExerciseObj.ArithmeticOperations(50,38);
                    break;
                case 4:
                    ExerciseObj.AverageCalculatorOFThreeNumbers(34,5,1);
                    break;
                case 5:
                    ExerciseObj.DisplayName();
                    break;
                case 6:
                    ExerciseObj.ArithmeticOperationsFromUser();
                    break;
                case 7:
                    int inputSecond;
                    System.out.println("Enter seconds to display on hours: ");
                    inputSecond=scanner.nextInt();
                    System.out.println();
                    ExerciseObj.ConvertSecondsIntoHours(inputSecond);
                    break;
                default:
                    System.out.println("Please enter between 1 to 7 ");

            }
            System.out.println("Do you want to run again the program ? press y/n : ");
            choice= scanner.next().charAt(0);
            if(choice == 'y'||choice =='Y')
            {
               contion= false;
            }
            if(choice == 'n'||choice =='N')
            {
                contion= true;
            }


        }while(!contion);
    }
}
