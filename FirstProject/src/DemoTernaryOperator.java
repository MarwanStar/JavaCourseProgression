/**
 * DemoTernaryOperator
 */
public class DemoTernaryOperator {

    public static void main(String[] args) {
        
        // Ternary operators are if statements but small and cool
        // variable = (condition)? ifTrue : ifFalse

        int score = 75;

        String passStatement = (score >= 65)? "Fail":"Pass";

        System.out.println(passStatement);
    }
}