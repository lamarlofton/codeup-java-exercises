import java.util.Scanner;

public class Bob {
    public Bob() {
    }

    public static void main(String[] args) {
        System.out.println("write something");
        Scanner input = new Scanner(System.in);
        String msg = input.nextLine();
        if (msg.endsWith("?")) {
            System.out.println("Sure");
        } else if (!msg.toUpperCase().equals(msg) && (!msg.endsWith("!") || msg.isEmpty())) {
            if (msg.isEmpty()) {
                System.out.println("Fine. Be that way");
            } else {
                System.out.println("Whatever");
            }
        } else {
            System.out.println("Whoa, chill out!");
        }

    }
}
