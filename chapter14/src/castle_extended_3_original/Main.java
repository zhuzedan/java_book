package castle_extended_3_original;

public class Main {
    public static void main(String[] args) {
        // 创建书籍
        Book book1 = new Book("科学引文索引", Book.NOVEL);
        Book book2 = new Book("百年孤独", Book.LITERATURE);
        Book book3 = new Book("哈利·波特与魔法石", Book.NOVEL);

        // 创建客户
        Customer customer = new Customer("张三");

        // 创建租赁记录
        Rental rental1 = new Rental(book1, 3); // 租借3天
        Rental rental2 = new Rental(book2, 6); // 租借6天
        Rental rental3 = new Rental(book3, 4); // 租借4天

        // 将租赁记录添加到客户
        customer.addRental(rental1);
        customer.addRental(rental2);
        customer.addRental(rental3);

        // 生成账单声明
        String statement = customer.statement();
        System.out.println(statement);
    }
}