package loopControlStatement;

import java.util.Scanner;

public class doWhileStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i =1;
        do {
            System.out.println(num*i);
            i++;
        }
        while (i<=10);
    }
}


/*
DECLARE num: INTEGER
DECLARE i: INTEGER
READ num
SET i:=1
DO
    PRINT num*i
    INCREMENT i
    END DO
    WHILE i<=10
END WHILE
 */
