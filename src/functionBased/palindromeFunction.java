package functionBased;

public class palindromeFunction {
    static boolean palindrome(int n){
        int num;
        int r;
        int b=0;
        num=n;
        while(num>0){
            r=num%10;
            b=b*10+r;
            num=num/10;
        }
        if (b==num)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(palindrome(121));
    }
}

/*
FUNCTION palindrome(n:INTEGER):INTEGER
    DECLARE num:INTEGER
    DECLARE r:INTEGER
    DECLARE b:INTEGER
    SET n:=num
    SET b:=0
    WHILE NUM>0
        r:=num mod 10
        b=b*10+r
        num=num/10
    END WHILE
    IF b==num THEN
        RETURN true
    ELSE
        RETURN false
    END FUNCTION
    PRRINT palindrome(123)
 */
