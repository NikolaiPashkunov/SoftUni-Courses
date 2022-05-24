import java.util.Scanner;

public class familyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double countNights = Double.parseDouble(scanner.nextLine());
        double priceNights = Double.parseDouble(scanner.nextLine());
        double percentAddedExpense = Double.parseDouble(scanner.nextLine());

        if (countNights>7) {
            priceNights = 0.95 * priceNights;
        }
            double totalPrice = countNights*priceNights;
            percentAddedExpense = percentAddedExpense*budget/100;

            if (budget >= totalPrice+percentAddedExpense) {

                System.out.printf("Ivanovi will be left with %.2f leva after vacation.", budget - (totalPrice + percentAddedExpense));

            }else{

                System.out.printf("%.2f leva needed.", (totalPrice+percentAddedExpense) - budget);

            }
        }
    }

