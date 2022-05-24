import java.util.Scanner;

public class skiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double days = Double.parseDouble(scanner.nextLine());
        String Accommodation = scanner.nextLine();
        String review = scanner.nextLine();

        double night = days-1;
        double price = 0;

        switch (Accommodation){

            case "room for one person":
                price = 18*night;
                if (review.equals("positive")){
                    price = price*1.25;
                } else {
                    price = 0.90*price;
                }
                break;
            case "apartment":
                price = 25*night;
                if (days<10) {
                    price = 0.70 * price;
                }else if (days>10 && days<15){
                    price = 0.65 * price;
                } else if (days>15) {
                    price = 0.50 * price;
                }
                if (review.equals("positive")){
                    price = price*1.25;
                } else {
                    price = 0.90 * price;
                }
                break;
            case "president apartment":
                price = 35*night;
                if (days<10) {
                    price = 0.90 * price;
                }else if (days>10 && days<15){
                    price = 0.85 * price;
                } else if (days>15) {
                    price = 0.80 * price;
                }
                if (review.equals("positive")){
                    price = price*1.25;
                } else {
                    price = 0.90 * price;
                }
                break;
        }
        System.out.printf("%.2f",price);
    }
}
