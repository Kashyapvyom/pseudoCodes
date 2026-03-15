package controlStatement;

import java.util.Scanner;

public class caseCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);
        switch (op) {
            case '+':
                System.out.println("Result = " + (a + b));
                break;

            case '-':
                System.out.println("Result = " + (a - b));
                break;

            case '*':
                System.out.println("Result = " + (a * b));
                break;

            case '/':
                System.out.println("Result = " + (a / b));
                break;

            default:
                System.out.println("Invalid operator");

        }
    }
}


/*
DECLARE a: INTEGER
DECLARE b: INTEGER
DECLARE x: INTEGER
READ a,b,x
CASE OF x
    1: PRINT a+b
    1: PRINT a-b
    1: PRINT a*b
    1: PRINT a/b
    1: PRINT a MOD b
OTHERWISE
    PRINT "WRONG"
END CASE
 */
