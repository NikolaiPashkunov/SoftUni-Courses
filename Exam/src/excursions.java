import java.util.Scanner;

public class excursions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double countPeople = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double price = 0;

        if (countPeople <= 5 && season.equals("spring")) {
            price = 50.00 * countPeople;
        } else if (countPeople <= 5 && season.equals("summer")) {
            price = 48.50 * countPeople;
        } else if (countPeople <= 5 && season.equals("autumn")) {
            price = 60.00 * countPeople;
        } else if (countPeople <= 5 && season.equals("winter")) {
            price = 86.00 * countPeople;
        } else if (countPeople >= 5 && season.equals("spring")) {
            price = 48.00 * countPeople;
        } else if (countPeople >= 5 && season.equals("summer")) {
            price = 45.0  * countPeople;
        } else if (countPeople >= 5 && season.equals("autumn")) {
            price = 49.50 * countPeople;
        } else if (countPeople >= 5 && season.equals("winter")) {
            price = 85.00 * countPeople;
        }
        if (season.equals("summer")){
            price = price - 0.15*price;
        }else if (season.equals("winter")){
            price = price + 0.08*price;
        }
        System.out.printf("%.2f leva.",price);
    }
}