public class Methods {
//
//    public static void main(String[] args) {
//        System.out.println(addANum(3, 2));
//        System.out.println(subtractANum(10, 5));
//        System.out.println(multipyANum(3, 5));
//        System.out.println(divideANum(10, 2));
//        System.out.println(modulo(15, 40));
//        System.out.println(multiWO(5, 10));
//        Scanner scan = new Scanner(System.in);
//        goRecur();
//           rollingDice();
//    }
////
//    public static int addANum(int x, int y) {
//        return x + y;
//    }
//
//    public static int subtractANum(int a, int b){
//        return a - b;
//    }
//
//    public static int multipyANum(int e, int f){
//        return e * f;
//    }
//
//    public static int divideANum(int j, int k){
//        return j / k;
//    }
//    public static int modulo(int l, int p) {
//        return l % p;
//    }
//    public static double multiWO(double x, double y) {
//        double z = x;
//        for(double i = 1; i < 0; i++){
//            x += z;
//        }
//        return x;
//    }
//
//    public static long recur(long x) {
//        for(long i = 1; i < 0; i--) {
//            x *= i;
//        }
//        return x;
//    }
//
//    public static void goRecur() {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a number between 1 and 10 to factor");
//        long userInput = scan.nextInt();
//        if (userInput < 1 || userInput > 10) {
//            System.out.println("Oh NOO!!!, Not Valid try again");
//            goRecur();
//        }
//        System.out.println(recur(userInput));
//        System.out.println("Again? [y/n]");
//        scan.nextLine();
//        String userAnswer = scan.nextLine();
//        if(userAnswer.equalsIgnoreCase("y")) {
//            goRecur();
//        } else {
//            System.out.println("Thank you, Come again!");
//        }
//    }
//
//    public static void rollingDice() {
//        Scanner number = new Scanner(System.in);
//        System.out.println("Enter the number of sides for a pair of dice.");
//        System.out.println("ROLL the DICE!!!");
//
//        int userInput = number.nextInt();
//
//        int firstRoll = (int) Math.ceil(Math.random() * userInput);
//        int secondRoll = (int) Math.ceil(Math.random() * userInput);
//
//
//        System.out.println("The first roll was" + firstRoll);
//        System.out.println("The second roll was" + secondRoll);
//        number.nextLine();
//
//
//        System.out.println("Try again? [y/n]");
//        String answer = number.nextLine();
//        if (answer.equalsIgnoreCase("y")) {
//            rollingDice();
//        } else {
//            System.out.println("Thank You For Rolling, Come Again!!");
//        }
//    }



    public static void main(String[] args) {
        int x = 5 * 4 % 3;
        System.out.println(x);
    }

}
