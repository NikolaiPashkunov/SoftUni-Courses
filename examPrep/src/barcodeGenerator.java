import java.util.Scanner;

public class barcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.nextLine());

        int startUnits = startNumber % 10;
        int startTens = startNumber / 10 % 10;
        int startHundreds = startNumber / 100 % 10;
        int startThousands = startNumber / 1000 % 10;


        int endNumber = Integer.parseInt(scanner.nextLine());

        int endUnits = endNumber % 10;
        int endTens = endNumber / 10 % 10;
        int endHundreds = endNumber / 100 % 10;
        int endThousands = endNumber / 1000 % 10;

        for (int number = startNumber; number <= endNumber; number++) {
            int units = number % 10;
            int tens = number / 10 % 10;
            int hundreds = number / 100 % 10;
            int thousands = number / 1000 % 10;

            if (units % 2 != 0 && tens % 2 != 0 && hundreds % 2 != 0 && thousands % 2 != 0) {

                boolean isValidUnits = units >= startUnits && units <= endUnits;
                boolean isValidTens = tens >= startTens && tens <= endTens;
                boolean isValidHundreds = hundreds >= startHundreds && hundreds <= endHundreds;
                boolean isValidThousands = thousands >= startThousands && thousands <= endThousands;

                if (isValidUnits && isValidTens && isValidHundreds && isValidThousands) {

                    System.out.print(number + " ");

                }
            }
        }
    }
}