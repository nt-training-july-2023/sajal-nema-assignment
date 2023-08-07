import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int number = sc.nextInt();
        int ans = 1;
        for(int i = number;i >= 1; i-- ){
            ans *= i;
        }
        sc.close();
        System.out.println(ans);
    }
}
