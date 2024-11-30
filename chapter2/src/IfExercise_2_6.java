import java.util.Scanner;

public class IfExercise_2_6 {
    public static void main(String[] args) {
        char alphabet;
        Scanner in = new Scanner(System.in);
        System.out.println("请输入a~e");
        alphabet = in.next().charAt(0);
        if (alphabet == 'a') {
            System.out.println("A");
        } else if (alphabet == 'b') {
            System.out.println("B");
        } else if (alphabet == 'c') {
            System.out.println("C");
        } else if (alphabet == 'd') {
            System.out.println("D");
        } else if (alphabet == 'e') {
            System.out.println("E");
        } else {
            System.out.println("other");
        }
    }
}
