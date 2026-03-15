package loopControlStatement;

import java.util.Scanner;

public class sumOfSeries1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0 ;
        for(int i=1;i<=num;i++){
            System.out.println(sum+i);
        }
    }
}


/*
DECLARE num: INTEGER
DECLARE sum: INTEGER
SET sum:=0
READ num
FOR i=1 TO num
    sum := sum+i
END FOR
PRINT sum
 */
