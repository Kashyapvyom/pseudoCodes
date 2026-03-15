package controlStatement;

import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cn = sc.nextInt();
        int ml = sc.nextInt();
        int cd = sc.nextInt();
        int avg = (cn+ml+cd)/3;
        System.out.println("average is : "  + avg);
        if(avg>=90)
            System.out.println("A+");
        else if (avg>=80&&avg<90)
            System.out.println("A");
        else if(avg>=70&&avg<80)
            System.out.println("B+");
        else if (avg>=60&&avg<70)
            System.out.println("B");
        else if (avg>=50&&avg<60)
            System.out.println("C+");
        else if (avg>=40&&avg<50)
            System.out.println("C");
        else if (avg<40)
            System.out.println("FAIL");
    }
}


/*
DECLARE cn: INTEGER
DECLARE ml: INTEGER
DECLARE cd: INTEGER
DECLARE avg: INTEGER
avg := (cn+ml+cd)/3
            IF (avg>=90)
            PRINT ("A+");
        ELSE IF (avg>=80&&avg<90)
            PRINT ("A");
        ELSE IF(avg>=70&&avg<80)
            PRINT ("B+");
        ELSE IF (avg>=60&&avg<70)
            PRINT ("B");
        ELSE IF (avg>=50&&avg<60)
            PRINT ("C+");
        ELSE IF (avg>=40&&avg<50)
           PRINT ("C");
        ELSE IF (avg<40)
           PRINT ("FAIL");
 */