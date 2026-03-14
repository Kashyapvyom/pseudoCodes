package operators;

public class example5 {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        a=a+b;
        b=a+b;
        a=b-a;
        b=a*b;
        System.out.println(a);
        System.out.println(b);
    }
}

/*
DECLARE a: INTEGER
DECLARE b: INTEGER
SET a:=2
SET b:=4
        a=a+b;
        b=a+b;
        a=b-a;
        b=a*b;
PRINT a
PRINT b
 */
