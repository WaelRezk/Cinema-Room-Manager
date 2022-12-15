import java.util.Scanner;

class EvenUpperCase {

    public static String upperEvenLetters(String message) {
        StringBuilder output = new StringBuilder();
        // write your code here
        for (int i = 0; i < message.length(); i++) {
            if (i % 2 == 0) {
                output.append(Character.toUpperCase(message.charAt(i)));
            } else {
                output.append(message.charAt(i));
            }
        }
        return output.toString();
    }

    // Don't change the code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.next();

        System.out.println(upperEvenLetters(message));
    }
}