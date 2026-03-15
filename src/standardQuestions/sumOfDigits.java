package standardQuestions;

import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        int r;
        while(n>0){
            r=n%10;
            sum=sum+r;
            n=n/10;
            System.out.println(sum);
        }
        //System.out.println(sum);
    }
}


/*
DECLARE n: INTEGER
DECLARE sum: INTEGER
DECLARE r: INTEGER
SET sum := 0
READ n
while n>0
    r:=n MOD 10
    sum:=sum+r
    n=n/10
END WHILE
PRINT sum
 */