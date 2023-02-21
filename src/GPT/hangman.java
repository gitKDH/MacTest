package GPT;

import java.util.Scanner;
import java.util.Random;

public class hangman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] words = {"apple", "banana", "cherry", "grape", "lemon"};
        String word = words[random.nextInt(words.length)];
        char[] wordChars = word.toCharArray();
        char[] guessedWord = new char[wordChars.length];
        for (int i = 0; i < guessedWord.length; i++) {
            guessedWord[i] = '_';
        }

        int wrongGuesses = 0;
        boolean wordGuessed = false;
        while (wrongGuesses < 6 && !wordGuessed) {
            System.out.print("Current word: ");
            for (char c : guessedWord) {
                System.out.print(c + " ");
            }
            System.out.println();
            System.out.print("Guess a letter: ");
            char guess = sc.next().charAt(0);

            boolean letterInWord = false;
            for (int i = 0; i < wordChars.length; i++) {
                if (wordChars[i] == guess) {
                    letterInWord = true;
                    guessedWord[i] = guess;
                }
            }

            if (!letterInWord) {
                wrongGuesses++;
                System.out.println("Incorrect! " + wrongGuesses + " incorrect guesses.");
            }

            wordGuessed = true;
            for (char c : guessedWord) {
                if (c == '_') {
                    wordGuessed = false;
                }
            }
        }

        if (wordGuessed) {
            System.out.println("You won! The word was " + word + ".");
        } else {
            System.out.println("You lost! The word was " + word + ".");
        }
    }
}
