public class Factorial_3_1 {
    public static void main(String[] args) {
        int i = 1;
        int n = 1;
        while (i <= 10) {
            n = n * i;
            i++;
        }
        System.out.println("10的阶乘结果为：" + n);
    }
}
