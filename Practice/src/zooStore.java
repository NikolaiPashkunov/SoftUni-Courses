import java.util.Scanner;

public class zooStore {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int dogFood = scanner.nextInt();
        int catFood = scanner.nextInt();


        double totalSum = catFood*4 + dogFood*2.50;

        System.out.printf("%.1f lv", totalSum);

    }
}
