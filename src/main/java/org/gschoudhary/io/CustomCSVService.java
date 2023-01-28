package org.gschoudhary.io;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class CustomCSVService {
    public static void fileWrite(Agent agent) throws IOException {
        System.out.println("ganesh ".getBytes(StandardCharsets.UTF_8));
        System.out.println("ganesh ".getBytes(StandardCharsets.UTF_16));
        File file = new File("agent.csv");
        FileOutputStream stream = new FileOutputStream(file);
        stream.write(agent.toString().getBytes(StandardCharsets.UTF_8));
        stream.write("\n".getBytes(StandardCharsets.UTF_16));

    }


    public static void fileReader() throws IOException {
        File file = new File("agent.csv");
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);

        while ( isr.ready()){
            System.out.print((char) isr.read());

        }
    }

    public static void main(String[] args) throws IOException {

       fileWrite(new Agent("ganesh", 20, "jaipur" ));
       fileReader();

    }
}
