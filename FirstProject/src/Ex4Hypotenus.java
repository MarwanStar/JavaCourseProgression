import java.util.Random;
public class Ex4Hypotenus {
    public static void main(String[] args) {
        // Hypotenus is c = sqrt(a^2 + b^2)
        // I didn't really follow the video here but that's because I did not want to write out a bunch of scan statements

        Random rand = new Random();

        double scale = 20;

        double a = rand.nextDouble() * scale;
        double b = rand.nextDouble() * scale;
        double c = Math.sqrt(a * a + b * b);

        System.out.println("Side a: " + a);
        System.out.println("Side b: " + b);
        System.out.println("Hypotenuse: " + c);

    }
}
