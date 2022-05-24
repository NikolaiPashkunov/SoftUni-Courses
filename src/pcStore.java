import java.util.Scanner;

public class pcStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double priceProcessor = Double.parseDouble(scanner.nextLine());
        double priceVideoCard = Double.parseDouble(scanner.nextLine());
        double priceRamMemory = Double.parseDouble(scanner.nextLine());
        double countRamMemory = Double.parseDouble(scanner.nextLine());
        double percentDiscount = Double.parseDouble(scanner.nextLine());

        double priceProcessorBGN = priceProcessor*1.57;
        double priceVideoCardBGN = priceVideoCard*1.57;

        double priceRamMemoryBGN = priceRamMemory*1.57*countRamMemory;
        double priceProcessorDiscount = priceProcessorBGN-(percentDiscount*priceProcessorBGN);
        double priceVideoCardDiscount = priceVideoCardBGN - (percentDiscount*priceVideoCardBGN);

        double total = priceRamMemoryBGN+priceProcessorDiscount+priceVideoCardDiscount;

        System.out.printf("Money needed - %.2f leva.", total);
    }
}
