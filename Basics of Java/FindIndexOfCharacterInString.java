//Find index of a given character or string from a String.

import java.util.Scanner;

public class FindIndexOfCharacterInString {
    public static int GetIdx(String s , char ch){
        for(int i = 0; i<s.length(); i++){
            if(ch == s.charAt(i)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String [] args){
        String mainString = "Hello There!";
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        sc.close();

        int idx = GetIdx(mainString , ch);
        if(idx != -1){
            System.out.println(ch + " is found at Index " + idx);
        }else{
            System.out.println("Character is not Found");
        }
    }
}
