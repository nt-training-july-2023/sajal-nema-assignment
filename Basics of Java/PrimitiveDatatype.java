// Exercise
// Write Java programs to declare, initialize, modify all the primitive data types.

public class PrimitiveDatatype {
    public static void main(String[] args) {

        // Numeric

        // Integral Datatype:
        byte b = 1; // range = -128 to 127
        System.out.println( "Byte Variable value is : " + b + " And the Type is " + ((Object) b).getClass().getSimpleName());

        short s = 12; // -32,768 to 32,767
        System.out.println( "Short Variable value is : " + s + " And the Type is " + ((Object) s).getClass().getSimpleName());

        int i = 123;
        System.out.println("Int Variable value is : " + i + " And the Type is " + ((Object) i).getClass().getSimpleName()); 

        long l = 13348274L;
        System.out.println("LongVariable value is : " + l + " And the Type is " + ((Object) l).getClass().getSimpleName()); // range
        // Floating Point Datatype
        float f = 23.434f; // 1.4e–045 to 3.4e+038
        System.out.println("Float Variable value is : " + f + " And the Type is " + ((Object) f).getClass().getSimpleName());

        double d = 223.43; // 4.9e–324 to 1.8e+308
        System.out.println("Double Variable value is : " + d + " And the Type is " + ((Object) d).getClass().getSimpleName());

        // Non Numeric
        char c = 'A'; // \u0000 to \FFFF (65536 characters)
        System.out.println("Char Variable value is : " + c + " And the Type is " + ((Object) c).getClass().getSimpleName());

        boolean bool = true;
        System.out.println("Boolean Variable value is : " + bool + " And the Type is "+ ((Object) bool).getClass().getSimpleName());
    }

}
