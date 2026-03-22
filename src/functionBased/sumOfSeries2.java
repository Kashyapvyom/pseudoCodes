package functionBased;

public class sumOfSeries2 {
    static double sum(int n){
        int s=0;
        for(int i=1;i<=n;i++){
            s=s+1/i;
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(sum(6));
    }
}

/*
FUNCTION sum(n:INTEGER):INTEGER
DECLARE s:INTEGER
SET s:=0
FOR i:=1 TO n
    s:=s+1/i
END FOR
    RETURN s
END FUNCTION
PRINT sum(6)

 */
