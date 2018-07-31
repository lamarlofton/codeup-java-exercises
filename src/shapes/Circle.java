package shapes;

public class Circle {
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(){

    }
    public double getArea(){
        double area = Math.pow(radius, 2)*Math.PI;
        System.out.println("The Area of This Circle Is " + area);
        return area;
    }
    public double getCircumference(){
        double circumference = (2 * Math.PI) * radius;
        System.out.println("The Circumference of This Circle Is " + circumference);
        return circumference;

    }
}
