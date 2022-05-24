import java.util.Scanner;

public class Eaquarium {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();
        double percent = scanner.nextDouble();

        double volume = length*width*height;
        double volumeLitres = volume*0.001;
        double occupiedSpace = percent/100;

        double total = volumeLitres*(1-occupiedSpace);

        System.out.println(total);
    }
}
