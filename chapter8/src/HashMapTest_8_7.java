import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest_8_7 {
    public static void main(String[] args) {
        Map<String, String> students = new HashMap<>();
        students.put("1", "张三");
        students.put("2", "李四");
        students.put("3", "王五");
        System.out.println("方式1获取所有的键和值");
        Set<String> keys = students.keySet();
        for (String key : keys)
            System.out.println(key + ":" + students.get(key));
        System.out.println("方式2获取所有的键和值");
        Set<Map.Entry<String, String>> entries = students.entrySet();
        Iterator<Map.Entry<String, String>> it = entries.iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
