import java.util.Random;

public class DemoRandom {
    public static void main(String[] args) {
        
        Random random = new Random();

        int randomInt;
        float randomFloat;
        float scaledValue;
        boolean isHeads;

        randomInt = random.nextInt(1, 7); // Like a dice, first number is implicit, second number is explicit
        randomFloat = random.nextFloat(); // Generates a random number between 0 and 1

        scaledValue = randomFloat * 100; // GPA for example

        isHeads = random.nextBoolean(); // Flips a coin

        System.out.println("Random Int: " + randomInt);
        System.out.println("Random Float: " + randomFloat);
        System.out.println("Your GPA: " + scaledValue);

        if(isHeads){
            System.out.println("HEADS");
        } else {
            System.out.println("TAILS");
        }

    }
}
