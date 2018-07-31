package shapes;

import util.Input;

public class CircleApp  extends Input {

    public static Input tester = new Input();
    public static void makeCircle(){
        System.out.println("Enter A Double");
        Circle circle = new Circle(tester.getDouble());
        circle.getArea();
        circle.getCircumference();
        if(tester.yesNo("Would You Like To Make Another Circle")){
            makeCircle();
        }

    }
    public static void main(String[] args) {
        System.out.println("Enter A Double");
        Circle circle = new Circle(tester.getDouble());
        circle.getArea();
        circle.getCircumference();



    }
}
