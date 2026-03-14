package start;

import java.util.Scanner;

public class squareAndCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int square = n*n;
        int cube = n*n*n;
        System.out.println(square);
        System.out.println(cube);
    }
}

/*
DECLARE X: INTEGER
DECLARE S: INTEGER
DECLARE C: INTEGER
    S=X*X
    C=X*X*X
PRINT S
PRINT C
 */
