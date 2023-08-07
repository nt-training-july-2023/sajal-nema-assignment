//Check if a String starts with a given character or String

import java.util.Scanner;

public class CheckStartCharacterInString {
    public static boolean checkStartCharacter(String s , String ch){
        int len = ch.length();
        for(int i=0;i<len;i++){
            if(s.charAt(i) != ch.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String [] args){
        String mainString = "Hello There!";
        Scanner sc = new Scanner(System.in);
        String ch = sc.nextLine();
        sc.close();
        if(checkStartCharacter(mainString , ch)){
            System.out.println(ch + " is the starting Character or SubString of " + mainString);
        }else{
            System.out.println(ch + " is not an Starting Character or String");
        }
    }
}
