package standardQuestions;

import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        int prev=0;
        int next=1;
        while (sum<=n){
            sum=prev+next;
            System.out.println(sum);
            prev=next;
            next=sum;
        }
    }
}

/*
DECLARE n: INTEGER
DECLARE sum: INTEGER
DECLARE prev: INTEGER
DECLARE next: INTEGER
SET prev:=0 , next:=1 , sum:=0
READ n
while sum<=n
    sum:=prev+next
    PRINT sum
    prev:=next
    next:=sum
END WHILE
 */
