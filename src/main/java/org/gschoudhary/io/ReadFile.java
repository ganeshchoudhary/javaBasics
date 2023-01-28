package org.gschoudhary.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

// Main class
public class ReadFile {
    // Main driver method
    public static void main(String[] args)
            throws IOException {

        // Creating a path choosing file from local
        // directory by creating an object of Path class
//        Path fileName = Path.of("/home/ganesh/Downloads/private_key");
//        Path filePath = Paths.get("c:/temp/demo.txt");
        StringBuilder contentBuilder = new StringBuilder();
        System.out.println(System.getProperty("user.dir"));

        Path path = Paths.get(System.getProperty("user.dir")+"/ganesh.txt");
        System.out.println(path.getFileName());
        String gs = Files.lines(path, StandardCharsets.UTF_8).reduce((a,b)-> a+b).get();
        System.out.println(gs);
        try (Stream<String> stream = Files.lines(path, StandardCharsets.UTF_8)) {

            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        } catch (IOException e) {
            //handle exception
        }
        // Printing the string
        System.out.println(contentBuilder.toString());
    }
}
