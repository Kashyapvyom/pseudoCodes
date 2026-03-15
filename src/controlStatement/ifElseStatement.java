package controlStatement;

import java.util.Scanner;

public class ifElseStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>5)
            System.out.println(n + " is greater than 5");
        else
            System.out.println(n + " is less than 5");
    }
}

/*
DECLARE X: INTEGER
    READ X
    IF X>5 THEN
        PRINT "X IS GREATER THAN 5"
    ELSE
        PRINT "X IS LESS THAN 5"
    END IF
 */
