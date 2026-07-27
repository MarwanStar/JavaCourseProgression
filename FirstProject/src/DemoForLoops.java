/**
 * DemoForLoops
 */
public class DemoForLoops {

    public static void main(String[] args) {
        // For loop iterating a string. Very basic and not bug proof program which prints a window of the string

        String word = "Fluminculus";
        int windowSize = 4;

        for(int i = 0; i <= (word.length() - windowSize); i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }

            for(int j = 0; j < windowSize; j++){
                System.out.print(word.charAt(i+j));
            }
            System.out.print("\n");
        }

        // I find it weird that for loops are explained before arrays, they seem like the main application of for loops
    }
}