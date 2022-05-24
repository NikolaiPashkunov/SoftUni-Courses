import java.util.Scanner;

public class radiantsToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double radiant = Double.parseDouble(scanner.nextLine());

        double degrees1 = radiant*180;
        double degrees2 = degrees1/Math.PI;

        System.out.println(degrees2);
    }
}
