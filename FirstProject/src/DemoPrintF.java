public class DemoPrintF {
    public static void main(String[] args) {
        // THANK GOD, I HATED USING THE PLUS SIGNS

        String name = "Madeline Celeste";
        int age = 26;
        double height = 18; // In pixels
        boolean isEmployed = true; // Probably

        System.out.printf("Hello %s, you are %d, are %.1f pixels tall \n", name, age, height);
        
        System.out.printf("Are you employed? %b \n", isEmployed);

        // Number formatter / flags

        // + - Displays when numbers are positive
        // , - Comma grouping (eg, 10,102.00)
        // ( - Replaces negative signs with parentheses
        // space = display minus if negative, space if positive

        double price1 = 9000000;
        double price2 = -1892.0;
        double price3 = 2119;

        System.out.printf("%+.1f, %+.1f, %+.1f \n", price1, price2, price3);
        System.out.printf("%,.1f, %,.1f, %,.1f \n", price1, price2, price3);
        System.out.printf("%(.1f, %(.1f, %(.1f \n", price1, price2, price3);
        System.out.printf("% .1f, % .1f, % .1f \n", price1, price2, price3);
    }
}
