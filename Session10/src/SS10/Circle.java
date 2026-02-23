package SS10;

public class Circle implements Shape4 {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        // dien tich
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public double getPerimeter() {
        // chu vi
        return Math.PI * 2 * radius;
    }
}
