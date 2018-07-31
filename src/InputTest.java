import util.Input;

public class InputTest extends Input {
    public static void main(String[] args) {
        Input tester = new Input();
        System.out.println("Enter a String");
        System.out.println("You enter " + tester.getString());
        System.out.println("Enter a Number between 5 and 10 " );
        tester.getInt(5, 10);
        System.out.println("Enter a decimal between 5.6 and 10.9");
        tester.getDouble(5.6, 10.9);

    }
}
