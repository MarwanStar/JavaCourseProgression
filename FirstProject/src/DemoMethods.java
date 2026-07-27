public class DemoMethods { // LETS GOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO I love you methods (functions)
    public static void main(String[] args) {
        happyBirthday("Penelope");

        System.out.println(addTwoNumbers(1, 9));
    }

    static void happyBirthday(String name){ // What a mysterious key word, static, how interesting
        System.out.println("Happy Birthday " + name);
        System.out.println("Happy Birthday " + name);
        System.out.println("Happy Birthday " + name);
        System.out.println("Happy Birthday " + name);
    }

    static int addTwoNumbers(int a, int b){
        return a + b;
    }
}
