package functionBased;

public class areaOfTriangle {
    static double aot(double b, double h){
        return 0.5*b*h;
    }
    public static void main(String[] args) {
        System.out.println(aot(3,4));
    }
}


/*
FUNCTION aot(b: REAL, h: REAL):REAL
    RETURN 0.5*b*h
END FUNCTION
PRINT aoc(3,4)
 */