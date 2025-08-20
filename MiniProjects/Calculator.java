package MiniProjects;
import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        while (true){
                System.out.print("Enter a value: ");
                double a = scr.nextInt();
                System.out.print("Choose a operator [+,-,*,/,%] : ");
                char c=scr.next().charAt(0);
                System.out.print("Enter b value: ");
                double b = scr.nextInt();
                switch(c) {
                    case '+':
                        System.out.println("Result of " + a + " + " + b + ": " + (a + b));
                        break;
                    case '-':
                        System.out.println("Result of " + a + " - " + b + " is:" + (a - b));
                        break;
                    case '*':
                        System.out.println("Result of " + a + " * " + b + ": " + a * b);
                        break;
                    case '/':
                        if(b==0){
                            System.out.println("Can't divide by 0");
                            break;
                        }
                        System.out.println("Result of " + a + " / " + b + ": " + a / b);
                        break;
                    case '%':
                        System.out.println("Result of " + a + " % " + b + ": " + a % b);
                        break;
                    default:
                        System.out.println("Invalid Operator! Choose one of this[+,-,/,*,%] ");
                }
                System.out.print("Want to Continue if Yes type[y/Y] Else [n]: ");
                char ch=scr.next().charAt(0);
                if(!(ch=='y' || ch=='Y')){
                    System.out.print("Thank You!");
                    break;
                }
        }


    }
}
