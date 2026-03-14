package operators;

public class example7 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        a=b+c;
        b=a*2;
        c=b-a;
        a=c+b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}


/*
DECLARE a: INTEGER
DECLARE B: INTEGER
DECLARE C: INTEGER
SET a:=1
SET b:=2
SET c:=3
        a=b+c;
        b=a*2;
        c=b-a;
        a=c+b;
PRINT a
PRINT b
PRINT c
 */
