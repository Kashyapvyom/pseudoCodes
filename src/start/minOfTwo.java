package start;

import java.util.Scanner;

public class minOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b)
            System.out.println("max is :" + a);
        else
            System.out.println("max is :" + b);
    }
}

/*
INTEGER FUNCTION min(int a , int b)
    INT m
    IF a<b THEN
        m=b
     ELSE
        m=a
     END IF
     RETURN m
END min
 */