import java.util.Scanner;

public class divisions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double n1 = Double.parseDouble(scanner.nextLine());
        double n2 = Double.parseDouble(scanner.nextLine());
        String operator = scanner.nextLine();

        double result;
        double oddEven;

        if (operator.equals("+"))
        {
            result = n1+n2;
            oddEven = result%2;
            if (oddEven==0){
            System.out.printf("%.0f + %.0f = %.0f - even",n1,n2,result);
            }else{
                System.out.printf("%.0f + %.0f = %.0f - odd",n1,n2,result);
            }
        } else if (operator.equals("-"))
        {
            result = n1 - n2;
            oddEven = result % 2;
            if (oddEven == 0) {
                System.out.printf("%.0f - %.0f = %.0f - even", n1, n2, result);
            } else {
                System.out.printf("%.0f - %.0f = %.0f - odd", n1, n2, result);
            }
        }else if (operator.equals("*"))
        {
            result = n1*n2;
            oddEven = result % 2;
            if (oddEven == 0) {
                System.out.printf("%.0f * %.0f = %.0f - even", n1, n2, result);
            } else {
                System.out.printf("%.0f * %.0f = %.0f - odd", n1, n2, result);
            }
        }else if (operator.equals("/"))
        {
            result = n1/n2;

            if (n2 != 0) {
                System.out.printf("%.0f / %.0f = %.2f", n1, n2, result);
            } else {
                System.out.printf("Cannot divide %.0f by zero",n1);
            }
        }else if (operator.equals("%")) {
            result = n1 % n2;

            if (n2 != 0) {
                System.out.printf("%.0f %% %.0f = %.0f", n1, n2, result);
            } else {
                System.out.printf("Cannot divide %.0f by zero", n1);
            }
        }

    }
}
