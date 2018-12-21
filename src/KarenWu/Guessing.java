package KarenWu;

import java.util.Scanner;

public class Guessing {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to me to guess or you?");
        System.out.println("Enter me if you want to.");
        System.out.println("Enter you if you want me to.");
        String who = input.nextLine();
        if (who.equals("me")) {
            int num = (int) (1 + Math.random() * 10);
            System.out.print("What is your name?");
            String name = input.nextLine();
            System.out.println("Guess the number " + name + ".");
            int score = 0;
            int guess;
            guess = input.nextInt();
            while (guess != num) {
                System.out.print("Guess again:");
                score = score + 1;
                guess = input.nextInt();
            }
            System.out.println("Congrats " + name + "!");
            System.out.println("You are correct, you guessed " + score + " times");
        }
        else
        {
            int guess = 0;
            int guessnum = 100;
            System.out.print("What is your name?");
            String name = input.nextLine();
            System.out.println("Input number to be Guessed between 1-100.");
            int num = input.nextInt();
            while (guessnum != num) {
                String updown = input.nextLine();
                if (updown.equals("higher")) {
                    guessnum = guessnum + guessnum / 2;
                    System.out.println("Is your number " + guessnum + "?");
                    System.out.println("Is it higher or lower" + "?");
                }
                else {
                    guessnum = guessnum / 2;
                    System.out.println("Is your number " + guessnum + "?");
                    System.out.println("Is it higher or lower" + "?");
                }
                guess++;
            }
            System.out.println("Your number is " + guessnum + ". I took " + guess + " tries.");
        }
    }
}
