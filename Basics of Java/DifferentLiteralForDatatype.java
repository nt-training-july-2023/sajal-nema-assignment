// Exercise :
//Write Java programs to find out what happen when we use different type of literals for data types.
//Like try to use float literal for integer data type.

public class DifferentLiteralForDatatype {
    public static void main(String[] args) {
        //Conversion from int to double
        double d = 34;  //Output: 34.0
        System.out.println(d);

        //Conversion from  double to int 
        // int i = 3.43; Type mismatch: cannot convert from double to int


        //Conversion from float to int 
        // int i = 3.43f; Type mismatch: cannot convert from float to int

        //Conversion from  char to int 
        int i = 'A';
        System.out.println(i);      //65

        //Conversion from  boolean to int 
        // int i1 = false; Type mismatch: cannot convert from boolean to int

        //Conversion from int to boolean 
        // boolean b = 0;  Type mismatch: cannot convert from int to boolean

        char ch = 65;
        System.out.println(ch); // A

        // float f = 3.45; Type mismatch: cannot convert from double to float
        double d1 = 4.55f;   
        System.out.println(d1 + " And the Type is " +((Object)d1).getClass().getSimpleName());  //4.550000190734863 And the Type is Double



    }
}
