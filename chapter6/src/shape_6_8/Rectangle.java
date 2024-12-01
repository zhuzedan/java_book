package shape_6_8;

public class Rectangle extends Shape{
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public void area() {
        double area = length * width;
        System.out.println("长方形的面积是：" + area);
    }
    @Override
    public void perimeter() {
        double perimeter = 2 * (length + width);
        System.out.println("长方形的周长是：" + perimeter);
    }
}
