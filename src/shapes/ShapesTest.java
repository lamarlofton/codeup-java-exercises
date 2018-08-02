package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        System.out.println("Rectangle....");
//        Rectangle box1 = new Rectangle(5, 4);
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());
//
//        System.out.println("Square....");
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());

        Measurable newShape = new Square2(5, 5);

        Measurable myShape2 = new Rectangle2(5, 10);

        System.out.println(myShape2.getArea() + " is the area of my Rectangle.\n" + newShape.getPerimeter() + " is the sum of the square.");

    }
}
