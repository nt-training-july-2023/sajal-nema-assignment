import java.util.Scanner;

public class AccessValueByIndex{
    public static void main(String []args){
        int arr[] = {23 , 42 , 44 , 53 , 34};
        
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter the index ");
            int index = sc.nextInt();
            
            if(arr.length == 0){
                throw new NullPointerException();
            }
            if(index < 0 || index > arr.length){
                throw new ArrayIndexOutOfBoundsException();
            }
            System.out.println("The element at index " + index + " is " + arr[index]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Index out of bound. Please specify correct index.");
        }catch(NullPointerException e){
            System.out.println("Error: Cannot access from the empty array. Array is empty.");
        }finally{
            sc.close();
        }
    }
}

