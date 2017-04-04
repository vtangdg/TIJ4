package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by degang on 17/4/3.
 */
public class BufferedInputFile {
    public static String read(String filename) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String s;
        StringBuilder sb = new StringBuilder();

        while ((s = in.readLine()) != null) {
            sb.append(s + "\n");
        }
        in.close();

        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        System.out.println(read("./src/io/BufferedInputFile.java"));
    }
}
