package util;
import java.util.Scanner;
    public class Input {

        private Scanner sc;
        public Input(){
            this.sc = new Scanner(System.in);
        }
        public String getString() {
            String userInput = sc.next();
            return userInput;
        }

        public String getString(String prompt) {
            System.out.println(prompt);
            String userInput = sc.nextLine();
            return userInput;
        }
        public Boolean yesNo(){
            System.out.println("Enter Yes or y");
            String firstLine = sc.next();
            return (firstLine.equalsIgnoreCase("yes") || firstLine.equalsIgnoreCase("y"));

        }
        public Boolean yesNo(String prompt) {
            System.out.println(prompt);
            String firstLine = sc.next();
            return (firstLine.equalsIgnoreCase("yes") || firstLine.equalsIgnoreCase("y"));
        }
        public int getInt(){
            return sc.nextInt();
        }
        public int getInt(int min, int max){
            int userInput = getInt();
            if(userInput < min || userInput > max){
                System.out.println("Out Of Range");
                return getInt(min, max);
            }
            return userInput;
        }
        public double getDouble(){
            return sc.nextDouble();
        }
        public double getDouble(double min, double max){
            double userInput = getDouble();
            if(userInput < min || userInput > max){
                System.out.println("wow");
                return getDouble(min, max);
            }
            return userInput;
        }

        public static void main(String[] args) {
            Input testInput = new Input();
            testInput.getInt(5, 10);
            testInput.getDouble(5.6, 10.9);
        }
    }


