package shapes;

public class Square extends Rectangle {
    private String Square;

// hardest part of Exercise learn it

    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }
}

