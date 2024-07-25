package ex_25072024;

public class Lab039 {
    public static void main(String[] args) {
        // Type Casting - Source and Destination conversion
        // Widening - Implicit, Explicit - lossless
        // Narrowing - Implicit, Explicit(with data type), loss


        // Widening
        byte b=10;
        int a=b; // VALID – Implicit Casting - JVM
        int a1= (int)b; // VALID – Explicit Casting
        System.out.println(a1);
        // narrowing
        int a2=300;
        //byte b=a1; //invalid implicit type casting
        byte c =(byte)a2; // invalid explicit type casting
        System.out.println(c);
    }
}
