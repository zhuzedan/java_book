import java.util.HashSet;
import java.util.Set;

public class Name_8_3 {

    public static void main(String[] args) {
        Set<String> names = new HashSet<String>();
        names.add("张三");  // 向集合添加元素
        names.add("李四");
        names.add("王五");
        System.out.println("初始集合元素为" + names);
        names.add("李四");// 向集合插入元素“李四”
        System.out.println("插入后集合元素为" + names);
    }
}
