public class FinalVariable {
    public static void main(String[] args) {
        final float PI = 3.14f;
        System.out.println("The Value of PI is : " + PI);

        //Reinitialize Final Variable
        // PI = 23;      //Error: The final local variable PI cannot be assigned. It must be blank and not using a compound assignment 
    }
}
