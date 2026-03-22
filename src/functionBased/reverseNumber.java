package functionBased;

public class reverseNumber {
    static int rev(int n) {
        int a, b;
        b = 0;
        while (n > 0) {
            a = n % 10;
            n = n / 10;
            b = b * 10 + a;
        }
        return b;
    }
        public static void main (String[]args){
            System.out.println(rev(123));

        }
    }

    /*
    FUNCTION rev(n:INTEGER):INTEGER
        DECLARE a:INTEGER
        DECLARE b:INTEGER
        SET b:=0
        WHILE n>0
            a:=n mod 10
            n:=n/10
            b:=b*10+a
    END WHILE
    RETURN b
    END rev
    PRINT rev(123)

     */
