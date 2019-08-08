import java.util.Scanner;
import java.util.Random;

public class hiLo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scan.nextLine();

        System.out.println("OK, " + name + " here are the rules:\n" +
                "The computer will come up with a number between 1 and 100 (inclusive).\n" +
                "If the user does not guess the number correctly, the program will display “Too low!” if the guess is too low and “Too high!” " +
                "if the guess is too high, and then will prompt the user for another guess.  This goes on until the number is guessed correctly.\n"
        );

        Scanner myScanner = new Scanner(System.in);
        String userInput;
        int userInt;

        if {

            System.out.println("Enter a number between 1 and 100");
            userInput = myScanner.nextLine();
            userInt = Integer.parseInt(userInput);


            Random randomGenerator = new Random();
            int randomInt = randomGenerator.nextInt(100);
            System.out.println("User please guess the number");

            }) else if {

        System.out.println("Great! You chose " + userInt);
        }
    }