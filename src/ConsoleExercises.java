import java.util.Scanner;
//
//2//
public class ConsoleExercises {
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

//        //1//
//  public class ConsoleExercises {
//      public static void main(String[] args) {
//          String userInput;
//          Scanner sc = new Scanner(System.in);
//          System.out.print("Enter a Integer: ");
//          int input = sc.nextInt();
//          System.out.println("You entered: --> \"" + input + "\" <--");
//      }
//
//  }

//3//

//public class ConsoleExercises {
//    public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       System.out.print("Write a Sentence: ");
//       String sentence = sc.nextLine();
//       System.out.println("You wrote" + "\"" + sentence + "\" ");
//
//
//        System.out.println("Give me the room length");
//        String length = sc.nextLine();
//        System.out.println("Give me the width of the room");
//        String width = sc.nextLine();
//
//        double area = Double.parseDouble (length) * Double.parseDouble(width);
//        System.out.println(area + " = "+length+" x "+width);
//
//        double perimeter = (2 * Double.parseDouble (length)) + (2 * Double.parseDouble(width));
//        System.out.println(perimeter + " = 2x"+length+" x 2x"+width);
//    }
//}
