import java.util.HashMap;
import java.util.Map;

public class HashMapTest_8_6 {

    public static void main(String[] args) {
        Map<String, String> students = new HashMap<>();
        students.put("1", "张三");
        students.put("2", "李四");
        students.put("3", "王五");
        students.put("4", "赵六");
        System.out.println("初始集合为" + students);
        System.out.println("键为3的值是" + students.get("3"));
        System.out.println("删除键为3的值是" + students.remove("3"));
        System.out.println("集合是否包含键为3的元素" + students.containsKey("3"));
        System.out.println("集合是否包含值为张三的元素" + students.containsValue("张三"));
        System.out.println("集合中所有的值" + students.values());
    }
}
