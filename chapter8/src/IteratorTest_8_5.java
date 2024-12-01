import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest_8_5 {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("张三");
        names.add("李四");
        names.add("王五");
        Iterator it = names.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
}
