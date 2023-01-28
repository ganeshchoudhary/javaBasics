package org.gschoudhary.utils.serialization;

import com.google.gson.Gson;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

public class SerializationService {
    public static void writeTOFile() throws IOException {
//        System.setProperty("user.dir", "/home/ganesh/Desktop/");
        File file = new File(System.getProperty("user.dir") + "ganesh.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write("ganesh singh".getBytes(StandardCharsets.UTF_8));
    }

    public static void writeTOArray() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(100);
        byteArrayOutputStream.write("ganesh".getBytes(StandardCharsets.UTF_8));
        System.out.println();
        for (byte b : byteArrayOutputStream.toByteArray()
        ) {
            System.out.print((char) b);
        }

    }

    public static void writeTOBuffer() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(100);

        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(byteArrayOutputStream);
        bufferedOutputStream.write("ganesh".getBytes(StandardCharsets.UTF_8));
        bufferedOutputStream.flush();
        System.out.println();
        for (byte b : byteArrayOutputStream.toByteArray()
        ) {
            System.out.print((char) b);
        }

    }

    public static byte[] convertToBytes(Object object) throws IOException {
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
             ObjectOutputStream out = new ObjectOutputStream(bos)) {
            out.writeObject(object);

            return bos.toByteArray();
        }
    }

    public static Object deserialize(byte[] data) throws IOException, ClassNotFoundException {
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        ObjectInputStream is = new ObjectInputStream(in);
        return is.readObject();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*
        Serialization is a mechanism of converting the state of an object into a byte stream. Deserialization is
        the reverse process where the byte stream is used to recreate the actual Java object in memory
         */
        User user = new User();
        user.name = "我的名字是 गणतंत्र दिवस";
        user.age = "23Y";
        System.out.println(user);

        Gson gson = new Gson();
        String g = gson.toJson(user);
        System.out.println(g);

        byte[] userBytes = convertToBytes(g);
        String s = new String(userBytes);
        System.out.println(s);

        for (int i = 0; i < userBytes.length; i++) {
            System.out.print(userBytes[i]);
        }

//        objects-> output stream / bytes-> transferred -> receive byte/inputstream -> convert to json/object

//        string to bytes/json -> bytes -> stream -> deserailized -> object
        byte[] bytes = "{'msg':'hello world'}".getBytes();
        byte[] b = "Morning".getBytes(StandardCharsets.UTF_8);     //byte array
//        InputStream
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println();


        HashMap<String, String> map = new HashMap<>();
        map.put("age", "23Y");
        String gs = gson.toJson(map);
        System.out.println(gs);

        Object user1 = deserialize(userBytes);
        System.out.println(gson.fromJson(user1.toString(), User.class));

        byte content[] = "Jtp is the best website to learn new technologies".getBytes();
        ByteArrayInputStream inputStream = new ByteArrayInputStream(content);

        while (inputStream.available() > 0) {
            System.out.print((char) inputStream.read());
        }

        writeTOFile();
        writeTOArray();
        File file = new File("https://gsg.png");
        System.out.println();
        System.out.println(file.toURI());
    }
}
