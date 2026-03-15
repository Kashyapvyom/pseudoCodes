package controlStatement;

import java.util.Scanner;

public class nestedIfExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass = sc.next();
        String uid = sc.next();
        if(uid=="admin")
            if(pass=="admin")
                System.out.println("WELCOME");
        else
                System.out.println("WRONG password");
        System.out.println("WRONG user ID");
    }
}


/*
DECLARE pass: STRING
DECLARE uid: STRING
READ pass
READ uid
        IF(uid=="admin")
            IF(pass=="admin")
                PRINT ("WELCOME");
        ELSE
                PRINT ("WRONG password");
        PRINT ("WRONG user ID");
 */