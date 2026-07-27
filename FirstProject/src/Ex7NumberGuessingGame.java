import java.util.Scanner;
import java.util.Random;

public class Ex7NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int range = 10; // Highest number to guess

        int goal = random.nextInt(0, range + 1);// Generate new random number
        int guess = 0;

        do{
            do{ // Loop to make sure answer is within range. Im ngl this is very ugly to me
                if(guess > range || guess < 0){
                    System.out.printf("%d is out of range! Try again! \n", guess);
                }
                System.out.printf("Please guess a number between 0 and %d: ", range);

                guess = scanner.nextInt();

            }while(guess > range || guess < 0);
            
            if(guess != goal){
                System.out.println("WRONG!!");
            }

        }while(guess != goal);

        System.out.println("Correct!! You win :)");

        scanner.close();
    }
    
}
