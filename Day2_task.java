package org.mj;
import java.util.*;
public class Day2_task {
    public static void main(String[] args) {
        System.out.println("________________________Question 1________________________");
        //1. [Beginner] Pass/Fail Checker (If-Else)
        //Objective: Use if-else to check student result
        //•	Task:
        //•	Write a Java program that takes a score variable (e.g., 48).
        int score=48;
        //•	If the score is 50 or more, print "Passed"
        if ( score >= 50){
            System.out.println("Passed");
        }
        //•	Otherwise, print "Failed"
        else{
            System.out.println("Failed");
        }

        System.out.println("________________________Question 2________________________");

        //2. [Beginner] Grade Evaluator (If-Else If Chain)
        //Objective: Assign grade based on score
        //•	Task:
        //•	Declare int score = 73;
        int score1 = 73;
        char grade = ' ';
        //•	Write a Java program to assign a grade based on the following criteria:
        //•	- A if score ≥ 90
        if (score1 >= 90){
            grade='A';
        }
        //•	- B if 75 ≤ score < 90
        else if (score1 >=75 && score1 < 90) {
            grade = 'B';
        }
        //•	- C if 60 ≤ score < 75
        else if (score1 >= 60 && score1 < 75) {
            grade = 'C';
        }
        //•	- D if score < 60
        else if (score1 < 60) {
            grade = 'D';
        }
        //•	Print the grade using: System.out.println("Grade: " + grade);
        System.out.println("Grade: " + grade);


        System.out.println("________________________Question 3________________________");

        //3. [Beginner] Number Printer Using Loops (For, While, Do-While)
        //Objective: Print numbers 1 to 5 using three loop types
        //•	Task:
        //•	Print 1 2 3 4 5 using:
        //•	- a for loop
        System.out.print("Printing numbers 1 to 5 using for loop: ");
        for(int i = 1; i <= 5; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        //•	- a while loop
        System.out.print("Printing numbers 1 to 5 using while loop: ");
        int i=1;
        while( i <= 5){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();
        System.out.print("Printing numbers 1 to 5 using do while loop: ");
        //•	- a do-while loop
        int j = 1;
        do{
            System.out.print(j+" ");
            j++;
        }
        while(j <= 5);
        System.out.println();

        //•	Label each output like: For Loop: 1 2 3 4 5

        System.out.println("________________________Question 4________________________");

        System.out.println();
        //4. [Intermediate] Even or Odd Number Classifier (Switch Statement)
        //Objective: Use switch to check if a number is even or odd
        //•	Task:
        //•	Declare an integer int num = 6;
        int num = 6;
        //•	Use a switch statement with (num % 2) to determine:
        switch (num % 2){
            case 0:
                System.out.println("Even Number");
                break;
            default:
                System.out.println("Odd Number");
        }
        //•	- If even → print "Even Number"
        //•	- If odd → print "Odd Number"

        System.out.println("________________________Question 5________________________");

        //5. [Intermediate] Multiples of 3 from 1 to 20 (For Loop with Conditionals)
        //Objective: Combine for loop and if
        //•	Task:

        //•	Write a for loop that prints all numbers between 1 and 20 that are divisible by 3.
        for( int n=1; n <= 20;n++){
            if(n%3==0){
                System.out.print(n+" ");
            }
        }
        //•	Expected output: 3 6 9 12 15 18
        System.out.println();


        System.out.println("________________________Question _6_______________________");

        //6. [Advanced] Menu-Driven Calculator (Switch + While Loop)
        //Objective: Build a simple calculator using switch and looping
        //•	Task:
        Scanner s = new Scanner(System.in);
        //•	Use a while loop to keep showing a menu:
        //•	1. Add
        //2. Subtract
        //3. Multiply
        //4. Divide
        //5. Exit
        while (true){
            System.out.println("1. Add ");
            System.out.println("2. Substract ");
            System.out.println("3. Multiply ");
            System.out.println("4. Divide ");
            System.out.println("5. Exit");
            System.out.println("pick a number");
            int user_pick = s.nextInt();
            if(user_pick == 5){
                System.out.println("Thank You! See You Again!");
                break;
            }
            System.out.print("Enter a value: ");
            int a=s.nextInt();
            System.out.print("Enter b value: ");
            int b = s.nextInt();
            switch (user_pick){
                case 1:
                    System.out.println("Result of a + b is: "+(a+b));
                    break;
                case 2:
                    System.out.println("Result of a - b is: "+(a-b));
                    break;
                case 3:
                    System.out.println("Result of a * b is: "+(a*b));
                    break;
                case 4:
                    if( b==0 ){
                        System.out.println("Can't divisible by 0");
                    }else{
                        System.out.println("Result of a / b is: "+(a/b));
                    }
                    break;
                default:
                    System.out.println("Invalid option. Please choose between 1 and 5.");
            }
        }
        //•	Let the user pick an option using a number
        //•	Use a switch to perform the operation
        //•	Loop continues until user chooses 5


        System.out.println("________________________Question 7________________________");

        //. [Advanced] Print Triangle Pattern (Nested For Loop)
        //Objective: Practice nested loops
        //•	Task:
        //•	Write a program that prints this pattern using nested for loops:
        //•	*
        //* *
        //* * *
        //* * * *
        for(int k = 1; k < 5;k++){
            for(int l = 1;l <= k ;l++){
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("________________________Question 8________________________");

        //8. [Challenge] Reverse Digits of a Number (While Loop)
        //Objective: Use a while loop to reverse a number
        //•	Task:
        //•	Declare int number = 1234;
        int number1 = 1234;
        int sum = 0;
        //•	Use a while loop to reverse and print: Output: 4321
        while(number1 != 0){
            int rem = number1 % 10;
            sum = sum * 10 +rem;
            number1/=10;
        }
        System.out.println("Reverse of a number"+sum);

    }
}
