import java.util.Scanner;
public class RotateByPos {
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int arr[] = {32 , 44 , 54 , 12 , 56 , 64 , 22 , 65};
    System.out.println("Enter the position : ");
    int pos = sc.nextInt();
    sc.close();
    int n = arr.length;
    for(int i = 0; i<pos ; i++){
        for(int j=n-1; j>=1; j--){
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;
        }
    }
    for(int i=0;i<n;i++){
        System.out.print(arr[i] + " ");
    }
   } 
}
