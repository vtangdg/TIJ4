package io;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;

/**
 * Created by degang on 17/4/4.
 */
public class FormattedMemoryInput {
    public static void main(String[] args) throws IOException {
        try {
            DataInputStream in = new DataInputStream(new ByteArrayInputStream(BufferedInputFile.read("src/io/FormattedMemoryInput.java").getBytes()));
            while (true) {
                System.out.println((char)in.readByte());
            }
        } catch (EOFException e) {
            System.out.println("end of stream");
        }
    }
}