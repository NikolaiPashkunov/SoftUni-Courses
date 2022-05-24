import java.util.Scanner;

public class swimming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeForUnits = Double.parseDouble(scanner.nextLine());

        double allTime = distance*timeForUnits;
        double resistanceTime = Math.floor(distance/15)*12.5;

        double totalTime = allTime+resistanceTime;

        if (totalTime<record) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",totalTime);
        }else{
            System.out.printf("No, he failed! He was %.2f seconds slower.", totalTime-record);

        }
    }
}
