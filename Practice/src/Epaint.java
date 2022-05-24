import java.util.Scanner;

public class Epaint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double nailon= scanner.nextDouble();
        double paint= scanner.nextDouble();
        double razreditel = scanner.nextDouble();
        double hours = scanner.nextDouble();

        double totalNailon = (nailon+2)*1.50;
        double totalPaint = (paint + 0.10*paint) * 14.50;
        double totalRazreditel = razreditel*5.0;

        double price = totalNailon+totalPaint+totalRazreditel +0.40;

        double totalPrice = ((price*0.30)*hours) + price;

        System.out.println(totalPrice);

    }
}
