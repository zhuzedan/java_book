import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;

public class FileUtil {
    public static final String SEPARATE_FIELD = ",";
    public static final String SEPARATE_LINE = "\r\n";

    public static void saveBooks(Books sellBook) {
        LocalDate date = LocalDate.now();
        String filename = "销售记录" + date.toString().replace("-", "") + ".csv";
        boolean isNewFile = !new File(filename).exists();

        createFile(filename, isNewFile, sellBook);
    }

    public static void createFile(String name, boolean label, Books sellBook) {
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(name, true))) {
            if (label) {
                // 如果是新文件，写入表头
                bos.write(("图书编号" + SEPARATE_FIELD + "图书名称" + SEPARATE_FIELD + "出版社" + SEPARATE_FIELD + "单价" + SEPARATE_FIELD + "购买数量" + SEPARATE_FIELD + "总价" + SEPARATE_LINE).getBytes());
            }
            // 写入数据
            String dataLine = sellBook.getId() + SEPARATE_FIELD + sellBook.getName() + SEPARATE_FIELD + sellBook.getPublish() + SEPARATE_FIELD + sellBook.getPrice() + SEPARATE_FIELD + sellBook.getNumber() + SEPARATE_FIELD + sellBook.getMoney() + SEPARATE_LINE;
            bos.write(dataLine.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}