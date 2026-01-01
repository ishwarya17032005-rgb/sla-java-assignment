public class task4.1{
    public static void main(String[] args) {
        String password = "mypassword"; // change password

        if (password.length() < 8) {
            System.out.println("Weak password");
        } else {
            System.out.println("Strong password");
        }
    }
}
