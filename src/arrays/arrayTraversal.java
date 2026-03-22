package arrays;

public class arrayTraversal {
    public static void main(String[] args) {
        int x[] = new int[5];
        x[0]=10;x[1]=20;x[2]=30;x[3]=40;x[4]=50;
        traversal(x,5);
    }
    static void traversal(int x[],int n){
        for(int i=0;i<n;i++){
            System.out.println(x[i]);
        }
    }
}

/*
PROCEDURE traversal(ARRAY x[] OF INTEGER,n:INTEGER)
    FOR i:=o TO n-1
        PRINT x[i]
    END FOR
END PROCEDURE
DECLARE a:ARRAY[0:4] OF INTEGER
DECLARE n:INTEGER
SET n:=5
CALL traversal(a[],n)

void traversal(int x[],int n)
{
    for(int i=0;i<x.length;i++)
        System.out.println(x[i]);
}
 */
