import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        TreeMap<Goods, String> goods = new TreeMap<>(new Comparator<Goods>() {
            @Override
            public int compare(Goods o1, Goods o2) {
                if (o1.getType() > o2.getType())
                    return 1;
                else if (o1.getType() < o2.getType())
                    return -1;
                else {
                    return o1.getId() - o2.getId();
                }
            }
        });
        goods.put(new Goods(103, 1), "毛巾");
        goods.put(new Goods(101, 1), "苹果");
        goods.put(new Goods(102, 1), "可乐");
        goods.put(new Goods(101, 2), "香蕉");
        Set<Goods> keys = goods.keySet();
        Iterator<Goods> it = keys.iterator();
        while (it.hasNext()) {
            Goods good = it.next();
            System.out.println(good + ":" + goods.get(good));
        }
    }
}