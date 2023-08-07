//WAP to write area of triangle in Java . Also take input using Scanner Class .

import java.util.Scanner;

public class AreaOfTriangle {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
    
        double height = sc.nextDouble();

        System.out.println("Area of triangle where base is " + base + " and height is " + height + " = " + Math.round(((height*base)/2) * 100000) / 100000.0);
        sc.close();
    }
}
