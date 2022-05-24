import java.util.Scanner;

public class orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOrders = Integer.parseInt(scanner.nextLine());

        double coffeePrice = 0;
        double totalPrice = 0;



        for (int i = 0; i < countOrders; i++) {

            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int daysInMonth = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());

            coffeePrice = (pricePerCapsule*(daysInMonth*capsulesCount));
            totalPrice += coffeePrice;

            System.out.printf("The price for the coffee is: $%.2f%n", coffeePrice);

        }
        System.out.printf("Total: $%.2f", totalPrice);
    }
}
