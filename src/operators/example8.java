package operators;

public class example8 {
    public static void main(String[] args) {
        int x=3;
        int y=5;
        x++;
        y=x+y;
        y++;
        x=y*2;
        System.out.println(x);
        System.out.println(y);
    }
}

/*
DECLARE x: INTEGER
DECLARE y: INTEGER
SET x:=3
SET y:=5
        INCREMENT x
        y=x+y;
        INCREMENT y
        x=y*2;
        PRINT x
        PRINT y
 */
