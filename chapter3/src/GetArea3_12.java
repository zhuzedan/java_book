public class GetArea3_12 {
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
// 由于三种形状的计算方式不同，所以要运用方法重载，分别写三个名称相同，但形参列表不同的方法。第一个方法有三个参数，用println语句提示输出：三角形面积为：。再根据传入的参数和公式输出面积。
// 第二个方法有一个参数，用println语句提示输出：圆的面积为：。再根据传入的参数和公式输出面积。第三个方法有两个参数，用println语句提示输出：矩形的面积为：。再根据传入的参数和公式输出面积。
// 当用户使用该方法传入的是三个参数时，则会调用第一个方法计算三角形的面积。当用户使用该方法传入的是一个参数时，则会调用第二个方法计算圆的面积。当用户使用该方法传入的是两个参数时，则会调用第三个方法计算矩形的面积。