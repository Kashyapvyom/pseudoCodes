package standardQuestions;

import java.util.Scanner;

public class digitPresentOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d=sc.nextInt();
        int r;
        boolean found=false;
        while (n>0) {
            r = n % 10;
            if (r == d) {
                found = true;
                break;
            }
            n = n / 10;
        }
        if (found)
            System.out.println("present");
        else
            System.out.println("not present");
    }
}


/*
START

DECLARE n: INTEGER
DECLARE d: INTEGER
SET found := false

WHILE n > 0
      r ← n mod 10
      IF r = d THEN
            found ← true
            BREAK
      ENDIF
      n ← n / 10
END WHILE
IF found = true THEN
      PRINT "present"
ELSE
      PRINT "not present"
ENDIF
END
 */