package Assignments.Assignments1;

import java.util.Scanner;

public class Level1Assignment {
    public static void main(String[] args) {
        //Question1 :In a program,input 3 numbers:A,B and C.You have to output the average of
        //these 3 numbers.
        //(Hint : Average of N numbers is sum of those numbers divided by N)
        System.out.println("-----------------------------Data Types-------------------------");
        System.out.println("-----------------------------Question 1-------------------------");
        Scanner s = new Scanner(System.in);
        System.out.print("Enter N value: ");
        int N = s.nextInt();
        System.out.print("Enter a value: ");
        double a = s.nextDouble();
        System.out.print("Enter b value: ");
        double b = s.nextDouble();
        System.out.print("Enter c value: ");
        double c = s.nextDouble();
        double result = ( a + b+ c);
        System.out.printf("Average of N numbers is: %.2f",result/N);
        System.out.println();
        System.out.println("-----------------------------Question 2-------------------------");
        //Question2 :Enter cost of 3 items from the user(using float datatype)
        //-a pencil,a pen and an eraser.
        //You have to output the total cost of the items back to the user as their bill.
        //(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced
        //problem)
        System.out.print("Enter cost of a pencil: ");
        float pencil = s.nextFloat();
        System.out.print("Enter cost of a pen: ");
        float pen = s.nextFloat();
        System.out.print("Enter cost of a eraser: ");
        float eraser = s.nextFloat();
        float total = (pencil + pen + eraser);
        System.out.println("Total cost of items(without gst): "+total);
        float gst = 0.18f*total;
        System.out.printf("Total cost of items (with gst): %.2f",total+gst);
        System.out.println();

        System.out.println("-----------------------------Operators--------------------------");
        System.out.println("-----------------------------Question 1-------------------------");
        //What will be the output of the following
        //programs :
        //class Test{
            //public static void main(String args[]){
                //int x = 2,y = 5;
        //        int exp1 = (x * y / x);
        //        int exp2 = (x * (y / x));
        //        System.out.print(exp1+" , ");
        //        System.out.println(exp2);
            //}
        //}
        int x = 2,y = 5;
        int exp1 = (x * y / x);
        int exp2 = (x * (y / x));
        System.out.print(exp1+" , ");
        System.out.println(exp2);
        System.out.println("-----------------------------Question 2-------------------------");
        //What will be the output of the following
        //programs :
        //class Test{
        //public static void main(String args[]){
        //int x = 2,y = 5;
        //        int x = 200, y = 50, z = 100;
        //        if (x > y && y > z) {
        //            System.out.println("Hello");
        //        }
        //        if (z > y && z < x) {
        //            System.out.println("Java");
        //        }
        //        if ((y + 200) < x && (y + 150) < z) {
        //            System.out.println("Hello Java");
        //        }
        //}
        //}
        int x2 = 200, y2 = 50, z = 100;
        if (x2 > y2 && y2 > z) {
            System.out.println("Hello");
        }
        if (z > y2 && z < x2) {
            System.out.println("Java");
        }
        if ((y2 + 200) < x && (y2 + 150) < z) {
            System.out.println("Hello Java");
        }

        System.out.println("-----------------------------Question 3-------------------------");
        //What will be the output of the following
        //programs :
        //class Test{
        //public static void main(String args[]){
        //int x = 2,y = 5;
        //        int x1 = 10, y1 =5;
        //        int exp11 = (y1 * (x1 / y1 + x1 / y1));
        //        int exp22 = (y1 * x1 / y1 + y1 * x1 / y1);
        //        System.out.println(exp11);
        //        System.out.println(exp22);
        //}
        //}
        int x1 = 10, y1 =5;
        int exp11 = (y1 * (x1 / y1 + x1 / y1));
        int exp22 = (y1 * x1 / y1 + y1 * x1 / y1);
        System.out.print(exp11+" , ");
        System.out.println(exp22);

        System.out.println("---------------------Conditional Statements---------------------");
        System.out.println("-----------------------------Question 1-------------------------");
        //Question 1 : Write a Java Program To Get A Number From The User And Print Whether It
        //Is positive or negative.
        System.out.print("Enter a number to perform num is positive or negative: ");
        int num =s.nextInt();
        if( num > 0){
            System.out.println("positive");
        }else if(num < 0){
            System.out.println("negative");
        }else{
            System.out.println("Zero");
        }
        System.out.println("-----------------------------Question 2-------------------------");

        //Question 2: Finish the following code so that it prints "You have a fever" if your
        //temperature is above 100 and otherwise prints "You don't have a fever".
        //class Solution{
        //  public static void main(String args[]){
                //double temp = 103.5;
        //}
        //}
        double temp = 103.5;
        if(temp > 100){
            System.out.println("You have a fever");
        }else{
            System.out.println("You don't have a fever");
        }
        System.out.println("-----------------------------Question 3-------------------------");
        //Question 3 :What will be the value of x & y in the following program:
        //class Solution{
        //  public static void main(String args[]){
                //int a = 63 ,b =36;
        //        boolean x = (a < b) ? true : false;
        //        int y = (a > b)? a : b;
        //}
        //}
        int a1 = 63 ,b1 =36;
        boolean x3 = (a1 < b1) ? true : false;
        int y3 = (a1 > b1)? a1 : b1;
        System.out.println("x is: "+x3+" y is: "+y3);
        System.out.println("-----------------------------Question 4-------------------------");
        //Write a program to find the factorial of any number entered by the user.
        System.out.print("Enter a factorial of a number: ");
        int n = s.nextInt();
        int fact = 1;
        if(n < 0){
            System.out.println("factorial is not defined for negative numbers");
        }else{
            for(int i = 1;i <= n;i++){
                fact =fact * i;
            }
        }
        System.out.println("Factorial of "+n+" is "+fact);
        System.out.println("-----------------------------Question 5-------------------------");
        //Question 5: Write a program that reads a set of integers, and then prints the sum of the
        //even and odd integers
        System.out.print("Enter how many number to perform even and odd count: ");
        int count =s.nextInt();
        int evenCount = 0;
        int oddCount = 0;
        for(int i = 1;i <= count;i++){
            int number = s.nextInt();
            if(number % 2 == 0){
                evenCount+=number;
            }else{
                oddCount+=number;
            }
        }
        System.out.println("Sum of evenCount is:  "+evenCount);
        System.out.println("Sum of oddCount is: "+oddCount);

    }
}
