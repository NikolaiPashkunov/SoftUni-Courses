import java.util.Scanner;

public class journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String region = "";
        String where ="";
        double price = 0;

       if (budget <=100){
           region ="Bulgaria";
           if (season.equals("summer")){
               price = 0.30*budget;
               where = "Camp";
           } else if (season.equals("winter")){
               price = 0.70*budget;
               where = "Hotel";
           }
       }

        else if (budget <=1000){
            region ="Balkans";
            if (season.equals("summer")){
                price = 0.40*budget;
                where = "Camp";
            } else if (season.equals("winter")){
                price = 0.80*budget;
                where = "Hotel";
            }
        }

       else if (budget > 1000){
           region ="Europe";
           where = "Hotel";
           price = 0.90*budget;
           }

        System.out.printf("Somewhere in %s %n%s - %.2f", region, where, price);

    }
}

