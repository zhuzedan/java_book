package Count6_2;

public class Square extends Shape{
    private double sideLength;
    public Square(double sideLength) {
        this.sideLength = sideLength;
    }
    @Override
    public void area() {
        double area = sideLength * sideLength;
        System.out.println("正方形的面积是：" + area);
    }
    @Override
    public void perimeter() {
        double perimeter = 4 * sideLength;
        System.out.println("正方形的面积是：" + perimeter);
    }
}
