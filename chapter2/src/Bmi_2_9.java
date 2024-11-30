import java.util.Scanner;

public class Bmi_2_9 {
    public static void main(String[] args) {
        String name;
        boolean sex = false;
        double hight, bmi;
        int weight;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名：");
        name = sc.nextLine();
        System.out.println("请输入性别：（男性为true，女性为false）");
        sex = sc.nextBoolean();
        System.out.println("请输入身高：（小数，单位为m）");
        hight = sc.nextDouble();
        System.out.println("请输入体重：（整数,单位为kg）");
        weight = sc.nextInt();
        bmi = weight / (Math.pow(hight, 2));
        if (sex) {
            System.out.print(name + "先生，");
            if (bmi < 20 && bmi > 0) {
                System.out.println("您的体重过轻，请加强膳食的补充！");
            } else if (bmi >= 20 && bmi < 25) {
                System.out.println("恭喜您，你的体重适中，请保持！");
            } else if (bmi >= 25 && bmi < 30) {
                System.out.println("您的体重已经过重，请注意锻炼身体！");
            } else if (bmi >= 30 && bmi < 35) {
                System.out.println("您已经属于肥胖行列，请注意饮食习惯！");
            } else if (bmi >= 35) {
                System.out.println("您已经非常肥胖，必须下定决心减肥了！");
            } else {
                System.out.println("您的输入有误，请重新输入数据。");
            }
        } else {
            System.out.print(name + "女士，");
            if (bmi < 19 && bmi > 0) {
                System.out.println("您的体重过轻，请加强膳食的补充！");
            } else if (bmi >= 19 && bmi < 24) {
                System.out.println("恭喜您，你的体重适中，请保持！");
            } else if (bmi >= 24 && bmi < 29) {
                System.out.println("您的体重已经过重，请注意锻炼身体！");
            } else if (bmi >= 29 && bmi < 34) {
                System.out.println("您已经属于肥胖行列，请注意饮食习惯！");
            } else if (bmi >= 34) {
                System.out.println("您已经非常肥胖，必须下定决心减肥了！");
            } else {
                System.out.println("您的输入有误，请重新输入数据。");
            }
        }
        System.out.println("专家指出最理想的体重指数是22！");
    }
}
