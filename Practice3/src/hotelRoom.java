import java.util.Scanner;

public class hotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String month = scanner.nextLine();
        int numberOfNights = Integer.parseInt(scanner.nextLine());

        double priceStudio=0;
        double priceApartment=0;

        switch (month){

            case "May":
            case "October":
                priceStudio = 50;
                priceApartment = 65;
                if (numberOfNights>7 && numberOfNights<14) {
                    priceStudio = 0.95 * 50;
                }else if (numberOfNights>14){
                    priceStudio = 0.70*50;
                    priceApartment = 0.90*65;
                }
                break;
            case "June":
            case "September":
                priceStudio = 75.20;
                priceApartment = 68.70;
                if (numberOfNights>14) {
                    priceStudio = 0.80 * 75.20;
                    priceApartment = 0.90*68.70;
                }
                break;
            case "July":
            case "August":
                priceStudio = 76;
                priceApartment = 77;
                if (numberOfNights>14) {
                    priceApartment = 0.90*77;
                }
                break;
        }
        System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.", priceApartment*numberOfNights,priceStudio*numberOfNights);
    }
}
