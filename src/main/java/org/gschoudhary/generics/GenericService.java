package org.gschoudhary.generics;

public class GenericService {
    public static void main(String[] args) {
        Printer<String, String> printer = new Printer<>("my name is ganesh ");
        printer.printDetails();
        System.out.println(printer.thisMakeRun("ganesh singh "));
    }
}
