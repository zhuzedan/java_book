import java.util.ArrayList;
import java.util.List;

public class Name {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("张三");  // 向集合中添加元素
        names.add("李四");
        names.add("王五");
        names.add("赵六");
        System.out.println("集合的长度是" + names.size());// 获取names中的元素个数
        System.out.println("第2个元素是" + names.get(1));// 获取names中索引为1的元素
        names.add(1, "陈七");// 在索引位置1添加元素“陈七”
        System.out.println("在位置1添加元素后集合为" + names);
        names.remove(3);// 删除索引3的元素
        System.out.println("删除索引3元素后集合为" + names);
        names.set(3, "钱八");// 将索引为3的元素替换为“钱八”
        System.out.println("修改索引3元素后集合为" + names);
        System.out.println(names.contains("钱八"));// 判断集合names中是否包含元素“钱八”
        names.clear();// 清空names中所有的元素
        System.out.println(names.isEmpty());// 判断集合names是否为空
    }
}
