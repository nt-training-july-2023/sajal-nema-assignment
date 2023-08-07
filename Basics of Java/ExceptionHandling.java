
    // Java program to demonstrate finally block
// When exception rise and not handled by catch


public class ExceptionHandling {
	public static void main(String[] args)
	{
		try {
			System.out.println("Inside try block");
			System.out.println(34 / 0);
		}
        catch(ArithmeticException e){
            System.out.println(e);
        }
		catch (NullPointerException e) {
            System.out.println("catch : exception not handled.");
		}
		finally {
			System.out.println("finally : i will execute always.");
		}
		System.out.println("i want to run");
	}
}

