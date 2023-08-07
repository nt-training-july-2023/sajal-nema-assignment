import java.util.Scanner;

class InvalidPasswordException extends Exception{
    public InvalidPasswordException(String errorMsg){
        super(errorMsg);
    }   
}

public class CheckPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();

        try{
            if(!checkPattern(password) || password.length() < 8){
                throw new InvalidPasswordException("Password not Valid .Password must contains at least eight characters, containing both letters and numbers.");
            }
            System.out.println("Password Accepted");
        }
        catch(InvalidPasswordException e){
            System.out.println("Error: " + e.getMessage());
        }finally{
            sc.close();
        }
    }

    public static boolean checkPattern(String pattern){
            boolean capital = false , smaller = false , digit = false;
            for(int i=0;i<pattern.length();i++){
                if(pattern.charAt(i) >= 'A' && pattern.charAt(i) <= 'Z'){
                    capital = true;
                }
                if(pattern.charAt(i) >= 'a' && pattern.charAt(i) <= 'z'){
                    smaller = true;
                }
                if(pattern.charAt(i) >= '0' && pattern.charAt(i) <= '9'){
                    digit = true;
                }
            }
            if(capital && smaller && digit){
                return true;
            }else{
                return false;
            }
        }
}
