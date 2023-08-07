// Write Java programs to demonstrate the rules of naming conventions of variables.

public class VariableNamingConvention {
    public static void main(String[] args) {
       /* Case sensitive
        Can contain Alphabets, numbers, but no special characters except _ and $
        Can start with Alphabets, _ or $ 
        Should not be a keyword
        Should not be similar to a class name
        No limit on length of name
        Should follow camel case style.
       */
    int $123 = 43;
    System.out.println($123);

    int _123 = 674;
    System.out.println(_123);

    int A_A = 748;
    System.out.println(A_A);

    int _$_$ = 947;
    System.out.println(_$_$);


    // int &sjf = 74;  Syntax error on token "&", delete this token
    }
    
}
