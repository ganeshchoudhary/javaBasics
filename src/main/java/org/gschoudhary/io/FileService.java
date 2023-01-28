package org.gschoudhary.io;

import java.io.*;

public class FileService {
    public static void main(String[] args) {

        CharArrayWriter charArrayWriter = new CharArrayWriter();
        charArrayWriter.append('a');
        charArrayWriter.append('a');
        charArrayWriter.append('a');
        charArrayWriter.append('a');
        System.out.println(charArrayWriter.toString());
        CharArrayReader charArrayReader = new CharArrayReader("gane\nsh".toCharArray());
        BufferedReader bufferedReader = new BufferedReader(charArrayReader);
        bufferedReader.lines().forEach(System.out::println);
        try {
            FileReader fileReader = new FileReader(new File("test.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
