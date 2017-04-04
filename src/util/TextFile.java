package util;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

/**
 * Created by degang on 17/4/4.
 */
public class TextFile extends ArrayList<String> {
    public static String read(String fileName) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader in = new BufferedReader(new FileReader(new File(fileName).getAbsoluteFile()));
            try {
                String s;
                while ((s = in.readLine()) != null) {
                    sb.append(s);
                    sb.append("\n");
                }
            } finally {
                in.close();
            }
        } catch (IOException e) {
            throw new RuntimeException();
        }

        return sb.toString();
    }

    // 向文件中写入文本
    public static void write(String fileName, String text) {
        try {
            PrintWriter out = new PrintWriter(new File(fileName).getAbsoluteFile());
            try {
                out.print(text);
            } finally {
                out.close();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException();
        }
    }

    // 读取一个文件，并根据splitter进行分隔
    public TextFile(String fileName, String splitter) {
        super(Arrays.asList(read(fileName).split(splitter)));

        if ("".equals(get(0))) {
            remove(0);
        }
    }

    public TextFile(String fileName) {
        this(fileName, "\n");
    }

    public void write(String fileName) {
        try {
            PrintWriter out = new PrintWriter(new File(fileName).getAbsoluteFile());
            try {
                for (String item : this) {
                    out.println(item);
                }
            } finally {
                out.close();
            }
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

    public static void main(String[] args) {
        String filePath = "src/util/TextFile.java";
        String file = read(filePath);
        write("src/util/test.txt", file);

        TextFile text = new TextFile("src/util/test.txt");
        text.write("src/util/test2.txt");

        TreeSet<String> words = new TreeSet<>(new TextFile(filePath, "\\W+"));
        System.out.println(words.headSet("a"));

    }
}
