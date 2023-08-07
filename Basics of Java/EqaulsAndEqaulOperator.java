public class EqaulsAndEqaulOperator {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
    
        // == or == checks if both objects point to the same memory location
        System.out.println("s1 == s2 is " + (s1 == s2));   //True
        System.out.println("s1 == s3 is " + (s1 == s3));   //False

        //equals() evaluates to the comparison of values in the objects
        System.out.println("s1.equals(s2) " + s1.equals(s2));   //True
        System.out.println("s1.equals(s3) " + s1.equals(s3));   //True
    }
}
