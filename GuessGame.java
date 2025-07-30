import java.util.Scanner;
import java.util.Random;

public class GuessGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int guess, attempt = 0, randomNum;

        randomNum = random.nextInt(1,11);

        System.out.println("Guess Game:");
        System.out.println("Enter a number between 1-10:");

        do{
            System.out.println("enter a guess: ");
            guess = scanner.nextInt();
            attempt++;

            if (guess < randomNum){
                System.out.println("too low!!!");
            }
            else if(guess > randomNum){
                System.out.println("too high!!!");
            }
            else{
                System.out.println("correct!!! Attempt:" + attempt);
            }
        }while(guess!=randomNum);

        scanner.close();
    }
}
