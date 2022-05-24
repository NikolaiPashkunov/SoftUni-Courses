import java.util.Scanner;

public class boatFishing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String Season = scanner.nextLine();
        double countFishermen = Double.parseDouble(scanner.nextLine());

        double price = 0;

        switch (Season) {

            case "Spring":
                price = 3000;
                break;

            case "Summer":
            case "Autumn":
                price = 4200;
                break;

            case "Winter":
                price = 2600;
                break;
        }

        if (countFishermen <= 6) {
            price = 0.90 * price;

        } else if (countFishermen >= 7 && countFishermen <= 11) {
            price = 0.85 * price;

        } else if (countFishermen > 12) {
            price = 0.75 * price;
        }

        if (countFishermen % 2 == 0 && !Season.equals("Autumn")) {
            price = 0.95 * price;
        }

        double diff = Math.abs(budget - price);

        if (budget >= price) {
            System.out.printf("Yes! You have %.2f leva left.", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", diff);

        }
    }
}



