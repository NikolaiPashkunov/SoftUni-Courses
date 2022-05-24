import java.util.Scanner;

public class excursionSale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int seaCount = Integer.parseInt(scanner.nextLine());
        int mountainCount = Integer.parseInt(scanner.nextLine());

        int totalProfit = 0;
        String input = "";

        while (true) {
            if (seaCount == 0 && mountainCount == 0) {
                System.out.println("Good job! Everything is sold.");
                break;
            }
            input = scanner.nextLine();
            if (input.equals("sea")) {
                if (seaCount > 0) {
                    totalProfit += 680;
                    seaCount--;
                }
            } else if (input.equals("mountain")) {
                if (mountainCount > 0) {
                    totalProfit += 499;
                    mountainCount--;
                }
            } else if (input.equals("Stop")) {
                break;
            }
        }
        System.out.println("Profit: " + totalProfit + " leva.");
    }
}