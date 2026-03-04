import java.util.*;

class Assignment14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int num = sc.nextInt();
            System.out.println("You entered: " + num);
        } 
        catch(InputMismatchException e) {
            System.out.println("Invalid input! Please enter only integers.");
        }

        sc.close();
    }
}
