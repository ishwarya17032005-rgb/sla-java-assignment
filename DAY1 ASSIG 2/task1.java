import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int correctPin = 1234;
        int enteredPin = 0;

        while (enteredPin != correctPin) {
            System.out.print("Enter your PIN: ");
            enteredPin = sc.nextInt();

            if (enteredPin != correctPin) {
                System.out.println("Incorrect PIN. Try again.");
            }
        }

        System.out.println("PIN Verified. Access Granted!");
        sc.close();
    }
}
