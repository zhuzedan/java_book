import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class NonRecursiveDirectoryTraversal {

    public static void main(String[] args) {
        String rootPath = "D:/example"; // 设置根目录
        String outputPath = "output.txt"; // 输出文件路径
        Queue<File> directories = new LinkedList<>();
        ArrayList<String> entries = new ArrayList<>();

        directories.offer(new File(rootPath));

        while (!directories.isEmpty()) {
            File currentDir = directories.poll();
            if (currentDir.isDirectory()) {
                entries.add(currentDir.getAbsolutePath() + " 目录");
                File[] files = currentDir.listFiles();
                if (files != null) {
                    for (File f : files) {
                        if (f.isDirectory()) {
                            directories.offer(f);
                        } else {
                            entries.add(f.getAbsolutePath() + " 文件");
                        }
                    }
                }
            } else {
                entries.add(currentDir.getAbsolutePath() + " 文件");
            }
        }

        try {
            writeToFile(entries, outputPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeToFile(ArrayList<String> entries, String outputPath) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(outputPath), "UTF-8"))) {
            for (String entry : entries) {
                writer.write(entry);
                writer.newLine();
            }
        }
    }
}