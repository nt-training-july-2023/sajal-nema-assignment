public class StringContanation {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Sajal";
        s1 = s1 + " " + s2;
        System.out.println(s1);

        //By StringBuilder
        StringBuilder s3 = new StringBuilder("Hello ");
        StringBuilder s4 = new StringBuilder("Sajal!");
        System.out.println(s3.append(s4));
    }
}
