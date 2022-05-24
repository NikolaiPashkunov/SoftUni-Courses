import java.util.Scanner;

public class vacation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        String typeOfPeople = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0;

        if (typeOfPeople.equals("Students")) {

            if (day.equals("Friday")) {
                if (numberOfPeople >= 30) {
                    price = (8.45 * numberOfPeople) * 0.85;
                } else {
                    price = 8.45 * numberOfPeople;
                }
            }

            if (day.equals("Saturday")) {
                if (numberOfPeople >= 30) {
                    price = (9.80 * numberOfPeople) * 0.85;
                } else {
                    price = 9.80 * numberOfPeople;
                }
            }

            if (day.equals("Sunday")) {
                if (numberOfPeople >= 30) {
                    price = (10.46 * numberOfPeople) * 0.85;
                } else {
                    price = 10.46 * numberOfPeople;
                }
            }

        }

        if (typeOfPeople.equals("Business")) {

            if (day.equals("Friday")) {
                if (numberOfPeople >= 100) {
                    price = 10.90 * (numberOfPeople - 10);
                } else {
                    price = 10.90 * numberOfPeople;
                }
            }

            if (day.equals("Saturday")) {
                if (numberOfPeople >= 100) {
                    price = 15.60 * (numberOfPeople - 10);
                } else {
                    price = 15.60 * numberOfPeople;
                }
            }


            if (day.equals("Sunday")) {
                if (numberOfPeople >= 100) {
                    price = 16.00 * (numberOfPeople - 10);
                } else {
                    price = 16.00 * numberOfPeople;
                }
            }
        }

            if (typeOfPeople.equals("Regular")) {
                if (day.equals("Friday")) {
                    if (numberOfPeople >= 10 && numberOfPeople <= 20) {
                        price = 15 * numberOfPeople * 0.95;
                    } else {
                        price = 15 * numberOfPeople;
                    }
                }

                if (day.equals("Saturday")) {
                    if (numberOfPeople >= 10 && numberOfPeople <= 20) {
                        price = 20 * numberOfPeople * 0.95;
                    } else {
                        price = 20 * numberOfPeople;
                    }
                }

                if (day.equals("Sunday")) {
                    if (numberOfPeople >= 10 && numberOfPeople <= 20) {
                        price = 22.50 * numberOfPeople * 0.95;
                    } else {
                        price = 22.50 * numberOfPeople;
                    }
                }
            }

        System.out.printf("Total price: %.2f", price);
    }
}