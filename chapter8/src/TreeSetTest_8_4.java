import java.util.TreeSet;

public class TreeSetTest_8_4 {

    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<Integer>();
        numbers.add(11);  // 向集合添加元素
        numbers.add(17);
        numbers.add(15);
        numbers.add(25);
        System.out.println("初始集合元素为" + numbers);
        System.out.println("集合的首元素为" + numbers.first());
        System.out.println("集合的尾元素为" + numbers.last());
        System.out.println("集合中小于或等于17的最大元素为" + numbers.floor(17));
        System.out.println("集合中大于16的最小元素为" + numbers.higher(16));
        System.out.println("删除的第一个元素为" + numbers.pollFirst());
        System.out.println("删除的第一个元素后的集合为" + numbers);
    }
}
