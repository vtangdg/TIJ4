package io;

import java.io.IOException;
import java.io.StringReader;

/**
 * Created by degang on 17/4/4.
 */
public class MemoryInput {
    public static void main(String[] args) throws IOException {
        StringReader in = new StringReader(BufferedInputFile.read("src/io/MemoryInput.java"));
        int c;

        while ((c = in.read()) != -1) {
            System.out.println((char)c);
        }
    }
}
