import java.util.Scanner;

public class EBasketballEquipment {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        double price = scanner.nextDouble();

        double kecki = price - (0.40*price);
        double equipment = kecki - (0.20*kecki);
        double ball = equipment/4;
        double accessories = ball/5;

        double total = price+kecki+equipment+ball+accessories;

        System.out.println(total);


    }
}
