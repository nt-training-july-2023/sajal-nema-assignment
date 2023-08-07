import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        int ans = 0;
        for (int i = number; i > 0; i /= 10) {
            ans = (ans * 10) + (i%10);
        }
        System.out.println("Reverse of : " + number + " is " + ans);
        sc.close();
    }

}
