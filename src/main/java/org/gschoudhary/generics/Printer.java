package org.gschoudhary.generics;
// TODO remember -generic don't work with permitive datatype
// generic is used to have type safe and gives error at compile time
public class Printer <T,V>{
    T value;

    public Printer(T value){
        this.value = value;
    }
    public V printDetails(){
        System.out.println("printing the value " + value);
        return null;
    }

    @SuppressWarnings("void")
    public  <S> S thisMakeRun(S str){
        System.out.println("testing " + str);
        return str;
    }
}
