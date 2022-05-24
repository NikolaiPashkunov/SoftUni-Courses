import java.util.Scanner;

public class Epens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double pensPrice = Double.parseDouble(scanner.nextLine());
        double markersPrice = Double.parseDouble(scanner.nextLine());
        double detergentPrice = Double.parseDouble(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());

        double totalPrice = (pensPrice*5.80) + (markersPrice*7.20) + (detergentPrice*1.20);
        double PriceWithDiscount = totalPrice-totalPrice*(discount/100);

        System.out.println(PriceWithDiscount);


    }
}
