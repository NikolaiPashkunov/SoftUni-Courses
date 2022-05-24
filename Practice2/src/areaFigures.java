import java.util.Scanner;

public class areaFigures {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        String type = scanner.nextLine();

        if (type.equals("square")){
            double a = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f",a*a);

        } else if (type.equals("rectangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", a * b);

        }else if (type.equals("triangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f",(a * b)/2);

        }else if (type.equals("circle")) {
            double a = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", a * a *3.1415833333);

        }
    }
}
