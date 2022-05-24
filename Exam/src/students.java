import java.util.Scanner;

public class students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentsCount = Integer.parseInt(scanner.nextLine());

        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double total = 0;

        for (int i = 1; i <= studentsCount; i++) {
            double currentNum = Double.parseDouble(scanner.nextLine());
            total += currentNum;

            if (currentNum >= 5.00) {
                p1++;

            } else if (currentNum >= 4.00 && currentNum <=4.99) {
                p2++;

            } else if (currentNum >= 3.00 && currentNum <= 3.99) {
                p3++;

            } else if (currentNum < 3.00) {
                p4++;

            }
        }

        double average = total / studentsCount;

        System.out.printf("Top students: %.2f%%%n", p1 / studentsCount * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", p2 / studentsCount * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", p3 / studentsCount * 100);
        System.out.printf("Fail: %.2f%%%n", p4 / studentsCount * 100);
        System.out.printf("Average: %.2f%n", average);
    }
}




