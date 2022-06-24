import java.util.Random;

/*
  Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;


public class Main {



    private static void guessGame() {
        // Random
        Random rand = new Random();
        int guess = rand.nextInt(100);
        int guessCounter = 0;
        int guessMachine = 0;

        // Scanner
        Scanner input = new Scanner(System.in);


        // while loop
        while (guess != 0) {
            System.out.println("Please enter a number");
            int playerInput = input.nextInt();
            guessCounter++;
            if (playerInput < guess) {
                System.out.println("Too low ");
            } else if (playerInput > guess) {
                System.out.println("Too high");
            } else {
                System.out.println("You Win!" + " Tries: " + guessCounter);
                guessMachine++;
                break;
            }
        }
    }

    public static void main(String[] args) {
        // calling guessGame
        guessGame();
    }


}


