package standardQuestions;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r;
        int temp = n;
        int b = 0;
        while (n > 0) {
            r = n % 10;
            b = b + r*r*r;
            n = n / 10;
        }
        if(b==temp)
            System.out.println("armstrong");
        else
            System.out.println("not armstrong");
    }
}


/*
DECLARE n: INTEGER
DECLARE r: INTEGER
DECLARE b: INTEGER
DECLARE temp: INTEGER
SET temp:=n
SET b:=0
READ n
WHILE n>0
    r:=n MOD 10
    b:=b+r*r*r
    n=n/10
END WHILE
IF b==temp THEN
    PRINT "ARMSTRONG"
ELSE
    PRINT "NOT ARMSTRONG"
END IF
 */