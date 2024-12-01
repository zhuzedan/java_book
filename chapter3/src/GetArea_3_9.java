public class GetArea_3_9 {
    public static void main(String[] args) {
        getArea(3, 4, 5);
        getArea(2);
        getArea(3, 4);
    }

    public static void getArea(int a, int b, int c) {
        double p = (a + b + c);
        System.out.println("三角形的面积为：" + Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }

    public static void getArea(int r) {
        System.out.println("圆的面积为：" + Math.PI * r * r);
    }

    public static void getArea(int a, int b) {
        System.out.println("矩形的面积为：" + a * b);
    }
}
