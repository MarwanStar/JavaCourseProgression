
import java.util.Scanner;

public class Ex6TemperatureTranslation{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the temperature? ");
        double oldTemperature = scanner.nextDouble();
        scanner.nextLine(); // To clear the sneaky /n from pressing enter

        System.out.print("What do you want to convert to (C/F)? ");
        String newUnit = scanner.nextLine().toUpperCase();

        double newTemperature = (newUnit.equals("C")) ? (oldTemperature - 32) * 5/9 : (oldTemperature * 9/5) + 32;

        System.out.printf("%.2f %s", newTemperature, newUnit);

        scanner.close();
    }

}