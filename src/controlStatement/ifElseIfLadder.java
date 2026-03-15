package controlStatement;

import java.util.Scanner;

public class ifElseIfLadder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x>0)
            System.out.println(x + " is positive");
        else if (x<0)
            System.out.println(x + " is negative");
            else if(x==0)
            System.out.println(x +" is equal to 0");
            else
            System.out.println(x + "is not an integer");
    }
}

/*
DECLARE x: INTEGER
READ x
            IF x>0 THEN
            PRINT  " is positive"
            ELSE IF x<0 THEN
            PRINT " is negative"
            ELSE IF x==0 THEN
            PRINT " is equal to 0"
            ELSE
            PRINT "is not an integer"
            END IF
 */
