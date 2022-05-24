import java.util.Scanner;

public class substitute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int firstNumber = 0;
        int secondNumber = 0;
        int validSubstitutions = 0;

        for(int i1 = k; i1 <= 8; i1++) {
            for(int j1 = 9; j1 >= l; j1--) {
                firstNumber = i1 * 10 + j1;

                for(int i2 = m; i2 <= 8; i2++) {
                    for(int j2 = 9; j2 >= n; j2--) {
                        secondNumber = i2* 10 + j2;

                        if (validSubstitutions == 6) {
                            return;
                        }

                        boolean isValid = secondNumber != firstNumber;
                        boolean isPossible = i1 % 2 == 0 && i2 % 2 == 0 && j1 % 2 == 1 && j2 % 2 == 1;

                        if (isValid && isPossible) {
                            System.out.println(firstNumber + " - " + secondNumber);
                            validSubstitutions++;
                        } else if (isPossible) {
                            System.out.println("Cannot change the same player.");
                        }
                    }
                }
            }
        }
    }
}

