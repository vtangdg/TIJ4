package io;

import java.io.*;

/**
 * Created by degang on 17/4/4.
 */
public class BasicFileOutput {
    static String src = "src/io/BasicFileOutput.java";
    static String dest = "src/io/BasicFileOutput.out";

    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new StringReader(BufferedInputFile.read(src)));
        // 原始方式
        // PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(dest)));
        // 快捷方式
        PrintWriter out = new PrintWriter(dest);
        int lineCount = 1;
        String s;

        while ((s = in.readLine()) != null) {
            out.println(lineCount++ + "：" + s);
        }
        out.close();
        System.out.println(BufferedInputFile.read(dest));
    }
}
