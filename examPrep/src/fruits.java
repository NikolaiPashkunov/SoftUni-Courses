import java.util.Scanner;

public class fruits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceStrawberries = Double.parseDouble(scanner.nextLine());
        double kgBananas = Double.parseDouble(scanner.nextLine());
        double kgOranges = Double.parseDouble(scanner.nextLine());
        double kgBerries = Double.parseDouble(scanner.nextLine());
        double kgStrawberries = Double.parseDouble(scanner.nextLine());

        double priceBerries = priceStrawberries/2;
        double priceOranges = priceBerries - (0.4*priceBerries);
        double priceBanans = priceBerries - (0.8*priceBerries);

        System.out.printf("%.2f", (priceStrawberries*kgStrawberries) + (priceBanans*kgBananas) + (priceOranges*kgOranges) +(kgBerries*priceBerries));

    }
}
