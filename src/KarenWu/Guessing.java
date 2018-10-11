package KarenWu;

import java.util.Scanner;

public class Guessing {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = (int)(1 + Math.random() * 10);
        System.out.print("Guess the number.");
        int score = 0;
        int guess;
        guess = input.nextInt();
        while (guess != num)
    {
            System.out.print("Guess again:");
            score = score + 1;
            guess = input.nextInt();
        }
        System.out.println("You are correct, you guessed " + score + " times");
        }
    }
