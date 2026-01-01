import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mobile;

        do {
            System.out.print("Enter 10-digit mobile number: ");
            mobile = sc.nextLine();

            if (mobile.length() != 10) {
                System.out.println("Invalid mobile number. Please try again.");
            }

        } while (mobile.length() != 10);

        System.out.println("Valid mobile number entered.");
        sc.close();
    }
}
