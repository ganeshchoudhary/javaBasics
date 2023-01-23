package org.gschoudhary;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello aasworld!");
        String s= "tests";
        System.out.println(s.hashCode()%20);

        System.out.println(23&(-5));
        System.out.println(0b11111&0b00001);
        System.out.println(0b11111&0b1111111111111110);
        System.out.println(~0b00001 +1);
    }
}