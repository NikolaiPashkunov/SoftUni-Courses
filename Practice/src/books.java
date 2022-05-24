import java.util.Scanner;

public class books {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int pages = scanner.nextInt();
        int pagesPerHour = scanner.nextInt();
        int numberOfDays = scanner.nextInt();

        int hoursPerDay = (pages/pagesPerHour)/numberOfDays;

        System.out.println(hoursPerDay);


    }
}
