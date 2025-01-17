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

        // Scanner
        Scanner input = new Scanner(System.in);

        // while loop
        int playerInputHolder = 0;
        int holder = 0;

        while (guess != 0) {
            System.out.println("Please enter a number");
            int playerInput = input.nextInt();
            guessCounter++;
            playerInputHolder = playerInput;

            if(playerInput == holder) {
                guessCounter--;
            }
                if(playerInputHolder!=0){
                holder=playerInputHolder;
            }

            if (playerInput < guess) {
                System.out.println("Too low ");
            } else if (playerInput > guess) {
                System.out.println("Too high");
            } else {
                System.out.println("You Win!" + " Tries: " + guessCounter);
                break;
            }
            System.out.println(guessCounter);
            }
    }

    public static void main(String[] args) {

        // calling guessGame
        guessGame();
    }
}


