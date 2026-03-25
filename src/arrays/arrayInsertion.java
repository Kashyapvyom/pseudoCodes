package arrays;

public class arrayInsertion {
    static int insertion(int a[], int n, int pos, int value) {
        int i;
        i = n;
        while (i >= pos) {
            a[i + 1] = a[i];
            i = i - 1;
        }
        a[pos] = value;
        n++;
        return n;
    }

    public static void main(String[] args) {

        int a[] = new int[10];
        int n = 5;
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;

        int pos = 2;
        int value = 25;

        n = insertion(a, n, pos, value);
        System.out.println("Array after insertion:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");

        }
    }
}

/*
INTEGER FUNCTION Insertion(ARRAY a[] OF INTEGER, INTEGER n, INTEGER pos, INTEGER value)
    DECLARE i: INTEGER
    SET i:=n
    WHILE i>=pos LOOP
        a[i+1]:=a[i]
        i:=i-1
     END WHILE
     a[pos]:= value
     n:=n+1
     RETURN n
END Insertion
 */
