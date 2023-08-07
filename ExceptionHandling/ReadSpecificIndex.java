import java.util.Scanner;

public class ReadSpecificIndex {
   public static void main(String[] args) {
    String []list = {"Sajal" , "John" , "Sameer"};
    Scanner sc = new Scanner(System.in);

    try{
        System.out.println("Enter the index :");
        int index = sc.nextInt();
        
        if(list.length == 0){
            throw new NullPointerException();
        }
        if(index < 0 || index > list.length){
            throw new IndexOutOfBoundsException();
        }
        System.out.println("The element at index " + index + " is " + list[index]);
    }
    catch(IndexOutOfBoundsException e){
        System.out.println("Error: Index out of bound ,please specify the correct index");
    }
    catch(NullPointerException e){
        System.out.println("Error: The list not contains any element .");
    }finally{
        sc.close();
    }
   } 
}
