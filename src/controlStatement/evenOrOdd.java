package controlStatement;

import java.util.Scanner;

public class evenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0)
            System.out.println("even");
        else
            System.out.println("odd");
    }
}


/*
DECLARE x: INTEGER
READ x
    IF x MOD 2==0 THEN
        PRINT "x is even"
    ELSE
        PRINT "x is odd"
    END IF
 */
