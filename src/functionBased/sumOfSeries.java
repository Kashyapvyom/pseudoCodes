package functionBased;

public class sumOfSeries {
    static int sum(int n){
        int s=0;
        for(int i=0;i<=n;i++){
            s=s+i;
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}

/*
FUNCTION sum(n:INTEGER):INTEGER
DECLARE s:INTEGER
SET s:=0
FOR i:=1 TO n
    s:=s+i
END FOR
    RETURN s
END FUNCTION
PRINT sum(5)

 */
