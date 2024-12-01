import java.util.LinkedList;

public class Name_8_2 {

    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<String>();
        names.add("张三");  // 向集合添加元素
        names.add("李四");
        System.out.println("初始集合元素为" + names);
        names.addFirst("王五");// 在集合头部插入元素
        System.out.println("在集合头部插入后集合元素为" + names);
        System.out.println("集合的第一个元素为" + names.getFirst());// 获取集合的第1个元素
        names.removeLast();// 删除集合的尾元素
        System.out.println("移除尾元素后集合为" + names);
    }
}
