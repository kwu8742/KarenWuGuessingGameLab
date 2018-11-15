package KarenWu;

import java.util.Scanner;

public class Guesser {

    public static String guesser;
    Scanner input = new Scanner(System.in);
    int guess = 0;
    int guessnum = 50;
    System.out.print("What is your name?");
    String name = input.nextline();
    System.out.println("Input number to be Guessed between 1-100.");
    int num = input.nextInt();
    while(guessnum != num) {
        System.out.println("Is your number" + guessnum + name + "?");
        System.out.println("Is it higher or lower " + name "?");
        String updown = input.nextline();
        if(updown == "higher") {
            guessnum = guessnum + guessnum/2;
        }
        else {
            guessnum = guessnum/2;
        }
        guess++;
    }
    System.out.println("Your number is " + guessnum ". I took " + guess "tries.");
}
