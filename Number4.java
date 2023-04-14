import java.util.Scanner;

public class Number4 {
    public static void main(String[] args) {
        int month = 5;
        int year = 1999;

        Scanner scanner = new Scanner(System.in);

        boolean guessed = false;
        while (!guessed) {
            System.out.print("Guess the day you were born (1-31): ");
            int day = scanner.nextInt();

            if (day == 24) {
                System.out.println("Correct Guess");
                guessed = true;
            } else {
                System.out.println("Incorrect Guess");
            }
        }

        scanner.close();
    }
}


