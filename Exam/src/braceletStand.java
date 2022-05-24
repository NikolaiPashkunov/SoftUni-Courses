import java.util.Scanner;

public class braceletStand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double pocketMoneyTeresaperDay = Double.parseDouble(scanner.nextLine());
        double profitPerDay = Double.parseDouble(scanner.nextLine());
        double expenses = Double.parseDouble(scanner.nextLine());
        double pricePresent = Double.parseDouble(scanner.nextLine());

        double totalMoney = (5*pocketMoneyTeresaperDay+5*profitPerDay) - expenses;

        if (totalMoney>=pricePresent){

            System.out.printf("Profit: %.2f BGN, the gift has been purchased.", totalMoney);
        } else {
            System.out.printf("Insufficient money: %.2f BGN.", pricePresent-totalMoney);
        }
    }
}
