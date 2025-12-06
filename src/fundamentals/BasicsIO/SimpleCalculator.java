package fundamentals.BasicsIO;

import java.util.Scanner;

public class SimpleCalculator{
    public static void main(String[] args){
        
        //declaring variables
        int sum;
        int num1, num2;
        String choice1 = "+";
        String choice2 = "-";
        String choice3 = "*";
        String choice4 = "/";
        String operater;
        //for user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose a number = ");
        num1 = scanner.nextInt();

        System.out.print("Choose between +, -, *, / = ");
        operater = scanner.next();

        System.out.print("Choose another number = ");
        num2 = scanner.nextInt();

        sum = num1 + operater + num2;


    }//end of main method

}//end of class
