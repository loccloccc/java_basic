package SS10;

public class Rectangle implements Shape4{

    private double width;
    private  double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return (width+height) * 2;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
