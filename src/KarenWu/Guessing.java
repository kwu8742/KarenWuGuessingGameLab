package KarenWu;

import java.util.Scanner;

public class Guessing {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = (int)Math.random();
        System.out.print("Guess the number.");
        String guess = input.nextLine();
        while (!guess.equals(num)) {
            System.out.print("Guess again:");

        }

    }
}
