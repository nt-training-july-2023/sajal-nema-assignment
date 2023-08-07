import java.util.Scanner;

public class InvalidDimensionException extends Exception{
    public InvalidDimensionException(String message){
        super(message);
    }

    public static void main(String[] args) {
        int length , breadth;

        Scanner sc = new Scanner(System.in);
        length = sc.nextInt();
        breadth = sc.nextInt();

        try{
            if(length <= 0 || breadth <= 0){
                throw new InvalidDimensionException("Length and Breadth is not less or eqaul to 0");
            }
            System.out.println("Valid Value of Length and Breadth");
        }catch(InvalidDimensionException e){
            System.out.println("Error : " + e.getMessage());
        }finally{
            sc.close();
        }
    }
}
