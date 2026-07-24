import java.util.Scanner;

public class Ex2MadLibs {
    
    public static void main(String[] args) {
        
        // Mad Libs Game apparently

        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("Give me an adjectve: ");
        adjective1 = scanner.nextLine();
        System.out.print("Give me a noun: ");
        noun1 = scanner.nextLine();

        System.out.print("Give me an adjectve: ");
        adjective2 = scanner.nextLine();
        System.out.print("Give me a verb: ");
        verb1 = scanner.nextLine();

        System.out.print("Give me an adjectve: ");
        adjective3 = scanner.nextLine();

        // Enjoy your funny punny story
        System.out.println("Yesterday I visited the " + adjective1 + " doctor.");
        System.out.println("She said I was infected with " + noun1 + "-ilitis");
        System.out.println("Symptoms include making me " + adjective2 + " and " + verb1);
        System.out.println("I was " + adjective3);

        scanner.close();
    }
}
