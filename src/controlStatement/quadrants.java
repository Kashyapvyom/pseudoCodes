package controlStatement;

import java.util.Scanner;

public class quadrants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x>0&&y>0)
            System.out.println("first quadrant");
        else if(x<0&&y>0)
            System.out.println("second quadrant");
        else if(x>0&&y<0)
            System.out.println("third quadrant");
        else if(x<0&&y<0)
            System.out.println("fourth quadrant");
        else
            System.out.println("no quadrant");
    }
}

/*
DECLARE x: INTEGER
DECLARE y: INTEGER
READ x,y
        IF (x>0&&y>0)
            PRINT("first quadrant")
        ELSE IF(x<0&&y>0)
            PRINT ("second quadrant")
        ELSE IF(x>0&&y<0)
            PRINT ("third quadrant")
        ELSE IF(x<0&&y<0)
            PRINT("fourth quadrant")
        ELSE
            PRINT ("no quadrant")
        END IF
 */
