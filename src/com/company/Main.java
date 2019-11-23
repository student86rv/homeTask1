package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        int guess = random.nextInt(1000);

        Scanner scanner = new Scanner(System.in);

        boolean youWin = false;
        int count = 0;

        while (!youWin) {
            System.out.println("Enter your number:");
            int input = scanner.nextInt();
            count ++;

            if (input == guess) {
                System.out.println("You win in " + count + " attempts!");
                youWin = true;
            }
            if (input > guess) {
                System.out.println("Too high!");
            }
            if (input < guess) {
                System.out.println("Too low!");
            }
        }
    }
}
