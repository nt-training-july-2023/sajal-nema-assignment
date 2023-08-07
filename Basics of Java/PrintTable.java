import java.util.Scanner;

class PrintTable{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");

        int number = sc.nextInt();
        System.out.println("Table of " + number + " is :");
        for(int i=1; i<=10; i++){
            System.out.println(i*number);
        }
        sc.close();
    }
}