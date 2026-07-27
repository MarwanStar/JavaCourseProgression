public class DemoSwitchStatements {
    public static void main(String[] args) {
        
        String day = "Monday";

        switch(day.toLowerCase()){ // Honestly I quite like this notation, very gender
            case "monday" -> System.out.println("It is a weekday :(");
            case "tuesday" -> System.out.println("It is a weekday :(");
            case "wednesday" -> System.out.println("It is a weekday :(");
            case "thursday" -> System.out.println("It is a weekday :(");
            case "friday" -> System.out.println("It is a weekday :(");
            case "saturday" -> System.out.println("It is a weekend :)");
            case "sunday" -> System.out.println("It is a weekend :)");
            default -> System.out.println("Not a weekday or a weekend :/");
        }
    }
}
