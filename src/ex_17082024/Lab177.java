package ex_17082024;

public class Lab177 {
    public static void main(String[] args) {
        //primitive to wrapper class
        int a=10;
        Integer b=a;
        System.out.println(a);
        System.out.println(b.byteValue()); // have extra functions


        //wrapper class to primitive

        Integer c=10; //Auto boxing int--> Integer
        int d=c; // unboxing Integer --> int
        System.out.println(c.floatValue());
    }
}
