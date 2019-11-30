package ua.epam.game;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final String START_MESSAGE = "Enter your number:";
    private static final String HIGH_MESSAGE = "Too high!";
    private static final String LOW_MESSAGE = "Too low!";
    private static final String YOU_WIN_MESSAGE = "You win in %d attempts!";

    public static void main(String[] args) {

        Random random = new Random();
        int guess = random.nextInt(1000);

        Scanner scanner = new Scanner(System.in);

        boolean youWin = false;
        int count = 0;

        while (!youWin) {
            System.out.println(START_MESSAGE);
            int input = scanner.nextInt();
            count ++;

            if (input == guess) {
                System.out.println(String.format(YOU_WIN_MESSAGE, count));
                youWin = true;
            }
            if (input > guess) {
                System.out.println(HIGH_MESSAGE);
            }
            if (input < guess) {
                System.out.println(LOW_MESSAGE);
            }
        }
    }
}
