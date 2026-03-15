package functionBased;

public class araeOfCircle {
    static double aoc(double r){
        return 3.14*r*r;
    }

    public static void main(String[] args) {
        System.out.println(aoc(2));
    }
}

/*
FUNCTION aoc(r: REAL):REAL
    RETURN 3.14*r*r
END FUNCTION
PRINT aoc(2)
 */
