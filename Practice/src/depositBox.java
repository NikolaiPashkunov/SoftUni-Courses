import java.util.Scanner;

public class depositBox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double deposit = Double.parseDouble(scanner.nextLine());
        double months = Double.parseDouble(scanner.nextLine());
        double interestRate = Double.parseDouble(scanner.nextLine());

        double totalSum = deposit + months*(deposit*(interestRate/100)/12);

        System.out.println(totalSum);


    }
}
