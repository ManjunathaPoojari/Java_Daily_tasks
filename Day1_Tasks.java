package Java_Basics;

public class Day1_Tasks {
    public static void main(String[] args) {

        //Day-1

        System.out.println("____________________________Basic Programs___________________________");
        System.out.println();
        System.out.println("-----------------------------------1----------------------------------");
        //Question 1:Assignment 1: Mastering Java Operators – Arithmetic, Relational, and Logical
        //1.1 Declares two integer variables: int a = 20; int b = 10;
        int a=20;
        int b=10;
        /*1.2. Performs the following operations:
        a. Add, subtract, multiply, and divide a and b
        b. Compare if a is greater than b and store the result in a boolean variable
        c. Check if a > b and b > 0 using a logical operator and store the result*/
        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        boolean result = a > b;
        boolean result1 = (a > b) && (b > 0);

        //1.3. Prints all results using System.out.println() in the format below.
        System.out.println("Addition: "+sum);
        System.out.println("Substraction: "+sub);
        System.out.println("Multiplication: "+mul);
        System.out.println("Division: "+div);
        System.out.println("Is a greater than b?: "+result);
        System.out.println("Is a > b and b > 0?: "+result1);


        System.out.println("-----------------------------------2----------------------------------");
        //Question 2:Assignment 2: Type Casting with Arithmetic and Logical Operations

        //2.1. Declares: int a = 9; double b = 4.0;
        int a1=9;
        double b1=4.0;
        //2.2 Performs the following operations:
        //a. Cast a to double and add to b
        double sum1 = (double) ( a1 + b1);
        //b. Divide a / b and store the result
        double div1 = a1 / b1;
        //c. Cast b to int and compare if a > (int)b
        boolean result2 = a > (int)b;

        //d. Check if a is divisible by 3 AND b > 2.5
        boolean result3 = ( a1 % 3 == 0 ) && ( b1 > 2.5);
        //2.3. Prints all results using System.out.println() in the format below.
            /*Expected Output:
            Sum (a + b): 13.0
            Division (a / b): 2.25
            Is a > (int)b? true
            Is a divisible by 3 and b > 2.5? true */
        System.out.println("Sum (a + b): "+sum1);
        System.out.println("Division (a / b): "+div1);
        System.out.println("Is a > (int)b? "+result2);
        System.out.println("Is a divisible by 3 and b > 2.5? "+result3);



        System.out.println("-----------------------------------3----------------------------------");
        //Question 3:Assignment 3: Type Casting and Modulus Operation Challenge
        //1. Declares: double x = 22.7; int y = 4;
        double x = 22.7;
        int y = 4;
        //2. Performs the following operations:
        //a. Cast x to int, then find (int)x % y
        int rem = (int)x % y;
        //b. Cast y to double and add to x
        double sum2 = (double)y + x;
        //c. Check if (int)x equals y * 5
        boolean result4 = (int)x == (y * 5);
        //d. Check if x > 20 AND y < 10
        boolean result5 = x > 20 && y < 10;
        //3. Prints all results using System.out.println() in the format below.
        /*Expected Output:
        (int)x % y: 2
        x + (double)y: 26.7
        Is (int)x equal to y * 5? true
        Is x > 20 and y < 10? true*/
        System.out.println("(int)x % y: "+rem);
        System.out.println("x + (double)y: "+sum2);
        System.out.println("Is (int)x equal to y * 5? "+result4);
        System.out.println("Is x > 20 and y < 10? "+result5);


        System.out.println();
        System.out.println("_______________________Advanced Programs______________________________");
        System.out.println();
        System.out.println("-----------------------------------1----------------------------------");
        //Advanced
        //Question 1: Compound Assignment and Modulo
        //Write a program that declares `int x = 17` and `int y = 5`. Perform the following:
        int x1 = 17;
        int y1 = 5;
        //- Use compound assignment operators to:
        //- Add `y` to `x`
        y1 += x1;
        //- Multiply `x` by `2`
        x1 *= 2;
        //- Use the modulo operator to find the remainder when `x` is divided by `y`
        int rem2=x1 % y1;
        /*- Print all results in the format:
        After addition: ...
        After multiplication: ...
        Remainder: ...*/
        System.out.println("Addition: "+y1);
        System.out.println("Mutlitpliaction x by 2: "+x1);
        System.out.println("Reaminder of x and y is: "+rem2);

        System.out.println("-----------------------------------2----------------------------------");
        //Question 2: Relational and Logical Operators
        //Declare `int age = 20`, `int score = 75`, and `int passMark = 50`. Then:
        int age = 20;
        int score = 75;
        int passMark = 50;
        //- Check if `score` is greater than or equal to `passMark`
        boolean pass = (score >= passMark);
        //- Check if the person is an adult (age ≥ 18) and passed the test
        boolean adult = (age >= 18) && pass;
        /*- Print results like:
        Did the student pass? ...
        Is the student an adult and passed? ...*/
        System.out.println("Did the student pass? "+pass);
        System.out.println("Is the student an adult and passed? "+adult);

        System.out.println("-----------------------------------3----------------------------------");
        //Question 3: Boolean Logic Challenge
        //Declare:
        boolean isJavaFun = true;
        boolean isChallenging = true;
        //Then:
        //- Use logical NOT and AND to check if Java is fun but not challenging.
        boolean chk = isJavaFun && !(isChallenging);
        //- Use logical OR to check if either statement is true.
        boolean chk1 = isJavaFun || isChallenging;

        //- Print both results.
        System.out.println("check if Java is fun but not challenging? "+chk);
        System.out.println("check if either statement is true? "+chk1);


        System.out.println("-----------------------------------4----------------------------------");
        //Question 4: Arithmetic Precision
        //Declare:
        double x2 = 7.0;
        int y2 = 2;
        //- Perform division and store it in a `double result`
        double result6 = x2 /y2;
        //- Use casting to get a `double` result from `int` division (e.g., `(double)y`)
        double d=x / (double) y;
        //- Print both approaches:
        //Division result without casting: ...
        //Division result with casting: ...
        System.out.println("Division result without casting: "+result6);
        System.out.println("Division result with casting: "+d);

        System.out.println("-----------------------------------5----------------------------------");
        //Question 5: Character and Unicode
        //Declare a character variable:
        char letter = 'A';
        //- Print its Unicode value using casting: `(int) letter`
        int value=(int)letter;
        //- Then add 1 to the character and print the new character
        letter += 1;
        //- Output should look like:
        //Unicode of A: ...
        //Next letter: ...
        System.out.println("Unicode of A: "+value);
        System.out.println("Next letter: "+letter);
    }
}
