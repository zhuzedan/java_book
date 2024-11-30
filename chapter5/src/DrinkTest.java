import java.util.Scanner;

public class DrinkTest {
    public static void main(String[] args) {
        Drink d = new Drink();
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入商品名称：");
        d.setName(sc.nextLine());
        System.out.print("请输入商品数量：");
        d.setNum(sc.nextInt());
        System.out.print("请输入商品价格：");
        d.setPrice(sc.nextDouble());
        d.show();
    }
}
