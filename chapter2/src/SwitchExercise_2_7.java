import java.util.Scanner;

public class SwitchExercise_2_7 {
    public static void main(String[] args) {
        char alphabet;
        Scanner in = new Scanner(System.in);
        System.out.println("请输入a~e");
        alphabet = in.next().charAt(0);
        switch (alphabet) {
            case 'a':
                System.out.println("A");
                break;
            case 'b':
                System.out.println("B");
                break;
            case 'c':
                System.out.println("C");
                break;
            case 'd':
                System.out.println("D");
                break;
            case 'e':
                System.out.println("E");
                break;
            default:
                System.out.println("other");
        }
    }
}
