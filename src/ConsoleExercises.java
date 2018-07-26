import java.util.Scanner;

public class ConsoleExercises {
    public ConsoleExercises() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first words:");
        String word1 = sc.nextLine();
        System.out.print("Enter second words:");
        String word2 = sc.nextLine();
        System.out.print("Enter thrid words:");
        String word3 = sc.nextLine();
        System.out.printf("You entered: %s %s %s", word1, word2, word3);
    }
}
