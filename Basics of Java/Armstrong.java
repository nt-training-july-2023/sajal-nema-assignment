import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter a Number");
    
        int number = sc.nextInt();
        int newNum = 0;
        for(int i=number;i>0;i/=10){
            newNum += Math.pow(i%10 , 3);
        }
        sc.close();
        if(newNum == number){
            System.out.println("Number is Armstrong");
        }
        else{
            System.out.println("Number is not Armstrong");
        }
    }
    
}
