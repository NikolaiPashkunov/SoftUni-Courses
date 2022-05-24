import java.util.Scanner;

public class bgnUSD {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        double usd = Double.parseDouble(scanner.nextLine());
        double dollar = 1.79549;
        double bgn = usd*dollar;

        System.out.println(bgn);
    }
}

