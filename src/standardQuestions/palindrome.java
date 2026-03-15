package standardQuestions;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r;
        int temp = n;
        int b = 0;
        while (n > 0) {
            r = n % 10;
            b = b * 10 + r;
            n = n / 10;
        }
        if(b==temp)
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");
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
    b:=b*10+r
    n=n/10
END WHILE
IF b==temp THEN
    PRINT "PALINDROME"
ELSE
    PRINT "NOT PALINDROME"
END IF
 */