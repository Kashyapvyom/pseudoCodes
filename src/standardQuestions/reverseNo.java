package standardQuestions;

import java.util.Scanner;

public class reverseNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int r;
        int b = 0;
        while (n>0){
            r = n%10;
            b=b*10+r;
            n=n/10;
        }
        System.out.println(b);
    }
}

/*
DECLARE n: INTEGER
DECLARE r: INTEGER
DECLARE b: INTEGER
SET b:=0
READ n
WHILE n>0
    r:=n MOD 10
    b:=b*10+r
    n=n/10
END WHILE
PRINT b
 */
