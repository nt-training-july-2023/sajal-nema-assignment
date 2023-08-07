// Get character at a given position from String

import java.util.Scanner;

public class ReplaceCharacter {
    public static void main(String[] args) {
        String str = new String();

        Scanner sc = new Scanner(System.in);

        str = "Hello there!";
        System.out.println("Enter Character to be Replaced from " + str);
        char ch = sc.next().charAt(0);
        System.out.println("Enter Replacement Character " );
        char replaceCh = sc.next().charAt(0);

        sc.close();
/*
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ch){
                str = str.substring(0, i) + replaceCh + str.substring(i+1);
            }
        }
        System.out.println(str);
 */

        StringBuilder newStr = new StringBuilder(str);
        for(int i=0;i<newStr.length();i++){
            if(newStr.charAt(i) == ch){
                newStr.setCharAt(i, replaceCh);
            }
        }
        System.out.println(newStr);
    }
}
