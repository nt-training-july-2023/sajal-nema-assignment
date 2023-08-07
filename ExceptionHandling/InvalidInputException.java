import java.util.Scanner;

class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 2000;
        try {
            System.out.println("Enter Withdrawl Amount");
            int withdrawl = sc.nextInt();

            if (withdrawl > balance) {
                throw new InvalidInputException("Insufficient Balance in the account");
            } else if (withdrawl < 0) {
                throw new InvalidInputException("Withdrawl Money can't be less than 0");
            }

            int remainingBal = balance - withdrawl;
            System.out.println("Withdrawl Successful");
            System.out.println("Remaining Balance is " + remainingBal);
        } catch (InvalidInputException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
