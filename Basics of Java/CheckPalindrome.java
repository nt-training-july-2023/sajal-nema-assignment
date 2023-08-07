import java.util.Scanner;
public class CheckPalindrome {
        public static void main(String [] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter new Number");
            int number = sc.nextInt();
            sc.close();
            //Approach 1:
            //By reversing the number and then compare both
            int newNum = 0;
            for(int i = number ; i > 0 ; i/=10){
                newNum = (newNum * 10) + (i%10);
            }

            if(number == newNum){
                System.out.println("Number is Pallindrome");
            }else{
                System.out.println("Number is not Pallindrome");
            }

            //Approach 2:
            //Take 2 pointers st and end and iterate till st > end , for string only.
        }
}
