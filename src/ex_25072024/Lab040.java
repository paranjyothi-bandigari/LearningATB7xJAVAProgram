package ex_25072024;

public class Lab040 {
    public static void main(String[] args) {
        long phone_no = 9876543210L;
        // short s = phone_no; // Implicit Narrowing - JVM?
        short s = (short) phone_no;
        System.out.println(s);
        // JVM - GC -

    }
}
