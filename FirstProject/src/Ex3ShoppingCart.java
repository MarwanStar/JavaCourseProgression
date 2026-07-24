import java.util.Scanner;

/**
 * Ex3
 */
public class Ex3ShoppingCart {

    public static void main(String[] args) {
        // Shopping Cart Program

        Scanner scanner = new Scanner(System.in);

        String item;
        int quantity;
        float price;
        float cost;

        System.out.print("What do you want to buy? ");
        item = scanner.nextLine();

        System.out.print("How many will you buy? ");
        quantity = scanner.nextInt();

        System.out.print("What is the price? ");
        price = scanner.nextFloat();

        cost = price * quantity;

        if(quantity>1){ // This is mostly for style points I thought it was fun
            System.out.println("You have purchased " + quantity + " " + item + "s for: " + cost);
        } else {
            System.out.println("You have purchased " + quantity + " " + item + "for: " + cost);
        }
        
        scanner.close();
        
    }
}