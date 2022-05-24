import java.util.Scanner;

public class printAndSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int last = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = first; i <= last; i++) {
            sum += i;
            System.out.printf("%d ", i);

        }

        System.out.println();
        System.out.printf("Sum: %d", sum);
    }
}
