public class DemoStringMethods {
    public static void main(String[] args) {
        // Atleast I don't need to import something for these, looking at C

        String word = "Fluminculus";

        int length = word.length(); // Returns the length of the word, should be 11
        char letter = word.charAt(2); // Returns character at index, should be u
        
        int index = word.indexOf("u"); // Returns index of first instance of character, should be 2
        // Caps sensitive, returns -1 if cannot find the character

        int lastIndex = word.lastIndexOf("u"); // Returns index of last instance of character, should be 9

        System.out.printf("%d, %c, %d, %d", length, letter, index, lastIndex);

        
    }
}
