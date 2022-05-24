import java.util.Scanner;

public class padwanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

double budget = Double.parseDouble(scanner.nextLine());
int studentCount = Integer.parseInt(scanner.nextLine());
double priceLight = Double.parseDouble(scanner.nextLine());
double priceRobe = Double.parseDouble(scanner.nextLine());
double priceBelt = Double.parseDouble(scanner.nextLine());

double sumLight = Math.ceil(studentCount  + 0.10*studentCount) * priceLight;
double sumRobes = studentCount * priceRobe;
double sumBelts = (studentCount - studentCount/6) * priceBelt;

double totalSum = sumLight + sumRobes + sumBelts;

if (totalSum < budget){
    System.out.printf("The money is enough - it would cost %.2flv.", totalSum );

} else {

    System.out.printf("George Lucas will need %.2flv more.", totalSum-budget);
}

    }
}
