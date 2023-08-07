// Get character at a given position from String

import java.util.Scanner;

public class GetCharacterAtPos {
    public static void main(String[] args) {
        String s1 = "Hello , I am Sajal";
        Scanner sc = new Scanner(System.in);
        int pos = sc.nextInt();

       // System.out.println(s1[pos]);    //The type of the expression must be an array type but it resolved to String
       System.out.println(s1.charAt(pos));
       sc.close();
    }
}
