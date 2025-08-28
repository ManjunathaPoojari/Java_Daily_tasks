package Assignments.ExceptionHandling;
public class ExceptionAssignment {

    // 1. Division by zero handling
    public static void divisionByZeroExample() {
        System.out.println("\n1. Division By Zero Example:");
        try {
            int a = 10, b = 0;
            int result = a / b; // risky line
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed!");
        }
        System.out.println("Program continues...");
    }

    // 2. Multiple catch blocks
    public static void multipleCatchExample() {
        System.out.println("\n2. Multiple Catch Blocks Example:");
        try {
            String str = null;
            int a = 10, b = 0;

            // Uncomment one to test
            // int result = a / b;       // ArithmeticException
            System.out.println(str.length()); // NullPointerException

        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught General Exception: " + e.getMessage());
        }
        System.out.println("Program continues...");
    }

    // 3. Nested try blocks
    public static void nestedTryExample() {
        System.out.println("\n3. Nested Try Example:");
        try {
            int arr[] = {10, 20, 30};
            System.out.println("Outer try block started.");

            try {
                int result = 10 / 0; // ArithmeticException
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Caught ArithmeticException in inner try: " + e.getMessage());
            }

            System.out.println(arr[5]); // ArrayIndexOutOfBoundsException

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException in outer try: " + e.getMessage());
        }
        System.out.println("Program continues...");
    }

    // 4. finally block
    public static void finallyExample() {
        System.out.println("\n4. Finally Block Example:");
        try {
            int a = 10, b = 0;
            int result = a / b; // will cause exception
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed (always runs).");
        }
        System.out.println("Program continues...");
    }

    // Main method to call all examples
    public static void main(String[] args) {
        divisionByZeroExample();
        multipleCatchExample();
        nestedTryExample();
        finallyExample();
    }
}
