import java.util.ArrayList;
import java.util.Scanner;

public class RecordBooksOrder {
    static ArrayList<Books> booksList = new ArrayList<>();

    public static void init() {
        // 初始化书架库存
        booksList.add(new Books(1, "Java Programming", "TechBooks Publishing", 59.99));
        booksList.add(new Books(2, "Advanced Python", "CodeMasters Press", 69.99));
        // 可以添加更多书籍...
    }

    public static Books getBooksById(int bookId) {
        for (Books book : booksList) {
            if (book.getId() == bookId) {
                return book;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        // 初始化书架
        init();

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入图书编号：");
        int bookId = scanner.nextInt();
        Books book = getBooksById(bookId);

        if (book == null) {
            System.out.println("找不到该图书编号，请重新输入！");
            return;
        }

        System.out.println("请输入购买数量：");
        int quantity = scanner.nextInt();

        if (quantity <= 0) {
            System.out.println("购买数量必须大于0！");
            return;
        }

        // 设置购买数量并更新总价
        book.setNum(quantity);
        // 保存交易记录到文件
        FileUtil.saveBooks(book);

        System.out.println("交易成功！" + book);
    }
}