import java.util.Scanner;

public class battleQica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstPlayerEggsCount = Integer.parseInt(scanner.nextLine()); //бр. яйца на първия
        int secondPlayerEggsCount = Integer.parseInt(scanner.nextLine()); //бр. яйца на втория

        //повтаряме: въвеждаме команда
        //спираме: команда == "End of battle"
        //продължаваме: команда != "End of battle"
        String command = scanner.nextLine(); // "End of battle" или "one" / "two"

        while (!command.equals("End of battle")) {
            //команда -> "one" или "two"
            //битка
            if (command.equals("one")) {
                secondPlayerEggsCount--;
            } else if (command.equals("two")) {
                firstPlayerEggsCount--;
            }
            //проверка имаме ли победител
            if (firstPlayerEggsCount == 0) {
                System.out.printf("Player one is out of eggs. Player two has %d eggs left.", secondPlayerEggsCount);
                break;
            } else if (secondPlayerEggsCount == 0) {
                System.out.printf("Player two is out of eggs. Player one has %d eggs left.", firstPlayerEggsCount);
                break;
            }

            command = scanner.nextLine();
        }

        if (command.equals("End of battle")) {
            System.out.printf("Player one has %d eggs left.%n", firstPlayerEggsCount);
            System.out.printf("Player two has %d eggs left.", secondPlayerEggsCount);
        }
    }
}


