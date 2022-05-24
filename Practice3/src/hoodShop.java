import java.util.Scanner;

public class hoodShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        Double quantity = Double.parseDouble(scanner.nextLine());

        if (product.equals("coffee")) {
            if (city.equals("Sofia")) {
                quantity = quantity * 0.50;

            } else if (city.equals("Plovdiv")) {
                quantity = quantity * 0.40;

            } else {
                quantity = quantity * 0.45;

            }
            System.out.printf("%f", quantity);
        }
        if (product.equals("water")) {
            if (city.equals("Sofia")) {
                quantity = quantity * 0.80;

            } else if (city.equals("Plovdiv")) {
                quantity = quantity * 0.70;

            } else {
                quantity = quantity * 0.70;

            }
            System.out.printf("%f", quantity);
        }
        if (product.equals("beer")) {
            if (city.equals("Sofia")) {
                quantity = quantity * 1.20;

            } else if (city.equals("Plovdiv")) {
                quantity = quantity * 1.15;

            } else {
                quantity = quantity * 1.10;
            }
            System.out.printf("%f", quantity);
        }
        if (product.equals("sweets")) {
            if (city.equals("Sofia")) {
                quantity = quantity * 1.45;

            } else if (city.equals("Plovdiv")) {
                quantity = quantity * 1.30;

            } else {
                quantity = quantity * 1.35;

            }
            System.out.printf("%f", quantity);
        }
        if (product.equals("peanuts")) {
            if (city.equals("Sofia")) {
                quantity = quantity * 1.60;

            } else if (city.equals("Plovdiv")) {
                quantity = quantity * 1.50;

            } else {
                quantity = quantity * 1.55;

            }
            System.out.printf("%f", quantity);

        }
    }
}