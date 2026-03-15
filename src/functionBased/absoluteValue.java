package functionBased;

public class absoluteValue {
    static int  abs(int n){
        if (n<0)
            return -n;
        else
            return n;
    }

    public static void main(String[] args) {
        System.out.println(abs(3));
        System.out.println(abs(-5));
    }
}

/*
FUNCTION abs(n: INTEGER):INTEGER
    IF n<0
        n:=-n
     ELSE
        n:=n
     END IF
     RETURN n
END FUNCTION
PRINT abs(3)
PRINT abs(-5)
 */
