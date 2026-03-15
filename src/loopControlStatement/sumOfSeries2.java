package loopControlStatement;

import java.util.Scanner;

public class sumOfSeries2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = sc.nextInt();
        int sum = 0 ;
        while (i<=num){
            sum = sum+(i*i);
            i++;
            System.out.println(sum);

        }
        //System.out.println(sum);
    }
}

/*
DECLARE num : INTEGER
DECLARE sum : INTEGER
DECLARE i : INTEGER
READ num
SET sum : = 0
WHILE(i<=num)
    sum = sum + (i*i)
    INCREMENT i
END WHILE
PRINT sum
 */
