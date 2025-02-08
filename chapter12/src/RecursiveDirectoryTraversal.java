import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class RecursiveDirectoryTraversal {

    public static void main(String[] args) {
        String rootPath = "D:/example"; // 设置根目录
        String outputPath = "output.txt"; // 输出文件路径
        ArrayList<String> entries = new ArrayList<>();

        try {
            traverseDirectories(rootPath, entries);
            writeToFile(entries, outputPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void traverseDirectories(String path, ArrayList<String> entries) throws IOException {
        File file = new File(path);
        if (file.isDirectory()) {
            entries.add(file.getAbsolutePath() + " 目录");
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    traverseDirectories(f.getAbsolutePath(), entries);
                }
            }
        } else {
            entries.add(file.getAbsolutePath() + " 文件");
        }
    }

    private static void writeToFile(ArrayList<String> entries, String outputPath) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(outputPath), StandardCharsets.UTF_8))) {
            for (String entry : entries) {
                writer.write(entry);
                writer.newLine();
            }
        }
    }
}