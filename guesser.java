import java.util.Scanner;
import java.util.Random;
public class Main{
       public static void main(String[] args){
        boolean gameover = false;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Welcome to the game.");
        System.out.println("Please select a number 0-2 for your choice from the menu!");
        if(scanner.nextInt() == 0 ){
            gameover = true;
        }//ends menu
        else if (scanner.nextInt() == 1){
            humanGuesser(scanner, random);
        }//ends elif 1
        else if (scanner.nextInt() == 2){
            computerGuesser(scanner);
        }//ends elif 2
    }//ends main
    public static void humanGuesser(Scanner scanner, Random random){
        boolean keepGoing = true;
        int randomNumber = random.nextInt(101);
        while (keepGoing){
            System.out.println("Please enter your guess: ");
            int guess = scanner.nextInt();
            if(guess == randomNumber){
                System.out.println("Your guess was correct!");
                keepGoing = false;
            }//ends if
            else if(guess < randomNumber){
                System.out.println("Your guess was too low, please guess higher.");
            }//ends too low
            else if(guess > randomNumber){
                System.out.println("Your guess is too high please guess lower");
            }//ends too high
        }//ends while
    }//ends Human
    public static void computerGuesser(Scanner scanner){
        int low = 1;
        int high = 100;
        int guess;
        String answer = scanner.nextLine();
        boolean keepGoing = true;
        while (keepGoing){
            guess = (low + high) / 2;
            System.out.println("My guess is " + guess);
            System.out.println("Is this too High too Low or Correct, use the first letter of every word to respond");
            if(answer.equalsIgnoreCase("C")){
                keepGoing = false;
                System.out.println("I got it correct!");
            }//ends if correct
            else if(answer.equalsIgnoreCase("L")){
                low = guess + 1;
            }//ends if low
            else if(answer.equalsIgnoreCase("H")){
                high = guess - 1;
            }//ends if high

        }//ends while
    }//ends computer guesser
}//ends main mainn