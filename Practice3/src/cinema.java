import java.util.Scanner;

public class cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String projections = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());
        int total = rows*columns;

        double price;

        if (projections.equals("Premiere")){
            price = total*12.00;
        }else if (projections.equals("Normal")){
            price = total *7.50;
        }else{
            price = total*5.00;
        }
        System.out.printf("%.2f leva", price);

    }
}
