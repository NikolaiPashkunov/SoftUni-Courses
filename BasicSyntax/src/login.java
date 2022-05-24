import java.util.Scanner;

public class login {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();
        StringBuilder password = new StringBuilder();

        for (int position = userName.length() - 1; position >= 0; position--) {

            char currentSymbol = userName.charAt(position);
            password.append(currentSymbol);
        }
        int countFailed = 0;
        String passwordEntered = scanner.nextLine();
        while (!passwordEntered.equals(password.toString())) {
            countFailed++;
            if (countFailed == 4) {
                System.out.printf("User %s blocked!", userName);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            passwordEntered = scanner.nextLine();
        }
        if (passwordEntered.equals(password.toString())) {
            System.out.printf("User %s logged in.", userName);
        }
    }
}