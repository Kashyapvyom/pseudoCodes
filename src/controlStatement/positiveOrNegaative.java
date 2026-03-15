package controlStatement;

import java.util.Scanner;

public class positiveOrNegaative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>0)
            System.out.println("positive");
        else
            System.out.println("negative");
    }
}

/*
DECLARE x: INTEGER
READ x
    IF x>0 THEN
        PRINT "x is positive"
    ELSE
        PRINT "x is negative"
    END IF
 */
