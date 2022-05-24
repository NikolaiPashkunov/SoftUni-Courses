import java.util.Scanner;

public class greenYard {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double totalMeters = scanner.nextDouble();

        double price = totalMeters * 7.61;
        double discount = 18*price/100;
        double totalPrice = price-discount;

        System.out.printf("The final price is: %.2f lv.%n", totalPrice);
        System.out.printf("The discount is: %.2f lv.", discount);


    }
}
