import java.util.Scanner;

class NotEvenNumberException extends Exception{
    public NotEvenNumberException(String errorMsg){
        super(errorMsg);
    }
}

public class CheckEvenNumber extends Exception{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        try{
            if(num%2 != 0){
                throw new NotEvenNumberException("Number is Not Even. Please enter a even number.");
            }
            System.out.println("It's an even number.");
        }catch(NotEvenNumberException e){
            System.out.println("Error: " + e.getMessage());
        }finally{
            sc.close();
        }
    }
}
