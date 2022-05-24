import java.util.Scanner;

public class Zada4ka {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String seriesName = scanner.nextLine();
        double seriesDuration = Double.parseDouble(scanner.nextLine());
        double lunchBreakDuration = Double.parseDouble(scanner.nextLine());

        double eating = lunchBreakDuration/8;
        double chill = lunchBreakDuration/4;

        double rest = lunchBreakDuration-eating-chill;

        double remainingMinutes = Math.ceil(rest-seriesDuration);
        double noMinutes = Math.ceil(seriesDuration-rest);

        if (rest>=seriesDuration){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", seriesName,remainingMinutes);
        }else{
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", seriesName, noMinutes);

        }
    }
}






