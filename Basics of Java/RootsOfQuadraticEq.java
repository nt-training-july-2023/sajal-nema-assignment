import java.util.Scanner;

public class RootsOfQuadraticEq {
    public static void main(String[] args) {
    double a, b, c, discriminant, root1, root2, realPart, imagPart;
    System.out.println("Enter coefficients a, b and c: ");

   Scanner sc = new Scanner(System.in);
   
   a = sc.nextInt();
   b = sc.nextInt();
   c = sc.nextInt();
   
sc.close();
    discriminant = b * b - 4 * a * c;

    if (discriminant > 0) {
        root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        System.out.println("root1 = " +  root1 + " and root2 = " + root2);
    }else if (discriminant == 0) {
        root1 = root2 = -b / (2 * a);
        System.out.println("root1 = root2 = ;" +  root1);
    }else {
        realPart = -b / (2 * a);
        imagPart = Math.sqrt(-discriminant) / (2 * a);
        System.out.println("root1 =  " + (realPart + imagPart) + " and root2 = "   + (realPart + imagPart));
    }
    }
}
