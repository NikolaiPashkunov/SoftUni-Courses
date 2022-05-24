import java.util.Scanner;

public class moviesss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        double days = Double.parseDouble(scanner.nextLine());

        double price = 0;

        if (season.equals("Winter") && destination.equals("Dubai")) {
            price = 45000;
        } else if (season.equals("Winter") && destination.equals("Sofia")) {
            price = 17000;
        }else if (season.equals("Winter") && destination.equals("London")) {
            price = 24000;
        }else if (season.equals("Summer") && destination.equals("Dubai")) {
            price = 40000;
        }else if (season.equals("Summer") && destination.equals("Sofia")) {
            price = 12500;
        }else if (season.equals("Summer") && destination.equals("London")) {
            price = 20250;
        }

        double total = price*days;

        if (destination.equals("Dubai")){

            total = total - 0.30*total;
        } else if (destination.equals("Sofia")){
            total = total + 0.25*total;
        }

        if (budget>=total){
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", budget-total);
        }else{
            System.out.printf("The director needs %.2f leva more!",total-budget);

        }
    }
}