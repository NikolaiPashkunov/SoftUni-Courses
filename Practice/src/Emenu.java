import java.util.Scanner;

public class Emenu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        double chicken = scanner.nextDouble();
        double fish = scanner.nextDouble();
        double vegetarian = scanner.nextDouble();

        double chickenTotal = chicken * 10.35;
        double fishTotal = fish * 12.40;
        double vegetarianTotal = vegetarian * 8.15;

        double totalPrice = chickenTotal + fishTotal + vegetarianTotal;

        double dessert = 0.20*totalPrice;

        double fees = 2.50;

        double total = totalPrice + dessert + fees;

        System.out.println(total);
    }
}
