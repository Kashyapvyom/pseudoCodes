package standardQuestions;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact =1;
        for(int i =1;i<=n;i++){
            fact = fact*i;
            System.out.println(fact);
        }
    }
}

/*
DECLARE n: INTEGER
DECLARE fact: INTEGER
SET fact : = 1
READ n
    FOR i:=n TO 1 STEP 1
        fact:= fact*i
    END FOR
    PRINT fact
 */
