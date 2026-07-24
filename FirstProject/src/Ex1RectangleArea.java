import java.util.Scanner;

public class Ex1RectangleArea {

    public static void main(String[] args) {
        // Excerisize 1, Calculate the area of a rectangle

        float width;
        float height;
        float area;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Gimme your width");
        width = scanner.nextFloat();

        System.out.println("Gimme your height");
        height = scanner.nextFloat();

        area = width * height;

        System.out.println("Youre final area is: " + area + " square lingles");

        scanner.close(); // Don't forget this it will bite you in the ass without an IDE
    }
}