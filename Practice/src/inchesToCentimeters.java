import java.util.Scanner;

public class inchesToCentimeters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = 2.54;

        double inches = a*b;

        System.out.printf("%.2f", inches);

    }
}
