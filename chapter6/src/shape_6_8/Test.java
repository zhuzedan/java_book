package shape_6_8;

public class Test {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 6);
        rectangle.area();
        rectangle.perimeter();
        Shape square = new Square(5);
        square.area();
        square.perimeter();
    }
}
