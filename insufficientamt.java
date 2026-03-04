import java.util.*;

class Assignment14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double balance = 5000;

        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();

        if(amount > balance) {
            throw new ArithmeticException("Insufficient Balance! Transaction Stopped.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal Successful.");
            System.out.println("Remaining Balance: " + balance);
        }

        sc.close();
    }
}
