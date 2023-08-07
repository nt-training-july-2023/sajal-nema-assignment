// The java.lang.String class provides many useful methods to perform operations, explore and write program for 5 more methods apart from mentioned above.

public class StringMethods {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Azz";

        // compareTo
        // int compareTo(String anotherString)
        // or
        // int compareToIgnoreCase(String str)
        // Compares two strings lexicographically.
        if (str1.compareTo(str2) == 0) {
            System.out.println("Strings are Equal");
        } else if (str1.compareTo(str2) > 0) {
            System.out.println("String object lexicographically follows the argument string");
        } else {
            System.out.println("String object lexicographically precedes the argument string");
        }

        // contains(CharSequence s)
        // Returns true if and only if this string contains the specified sequence of
        // char values.
        if (str1.contains("ll")) {
            System.out.println(str1 + " contains ll");
        } else {
            System.out.println("ll is not there in " + str1);
        }

        // boolean equals(Object anObject)
        // Compares this string to the specified object.Case Sensitive
        // or
        // equalsIgnoreCase(String anotherString)
        // Compares this String to another String, ignoring case considerations.
        String s3 = "One";
        String s4 = "one";
        if (s3.equals(s4)) {
            System.out.println("Strings are Eqaul");
        } else {
            System.out.println("String are not Equal");
        }

        // lastIndexOf
        int idx = s3.lastIndexOf('n', s3.length() - 1);
        System.out.println(idx);

        // trim
        String s5 = "   Hello ";
        s5 = s5.trim();
        System.out.println(s5);

        // isEmpty
        // public boolean isEmpty()
        // Returns true if, and only if, length() is 0.
        String s6 = "";
        if (s6.isEmpty()) {
            System.out.println("String is Empty");
        } else {
            System.out.println("String is not Empty");
        }

        // concat
        // public String concat(String str)
        // Concatenates the specified string to the end of this string.
        
        String s7 = "FirstName";
        String s8 = " LastName";
        s7 = s7.concat(s8);
        System.err.println(s7);
    }
}
