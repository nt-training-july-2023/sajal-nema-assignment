//Write a program to use all arithmetic operator

public class ArithmeticOperator {
    //+ , - , / , % , *

    public static void main(String[] args) {
        int a = 23;
        int b = 34;

        System.out.println("a = " + a + " & b = " + b);

        int plus = a + b;
        System.out.println("a + b = " + plus);

        int minus = a-b;
        System.out.println("a - b = " + minus);

        int multiply = a*b;
        System.out.println("a * b = " + multiply);

        int divide = a/b;
        System.out.println("a / b = " + divide);

        int modulo = a%b;
        System.out.println("a % b = " + modulo);
        
    }
}
