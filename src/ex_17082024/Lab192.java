package ex_17082024;

public class Lab192 {
    public static void main(String[] args) {
        int c= 0;
        try {
            c = 10/0;
        } catch (Exception e) {
            System.out.println("ArithmeticException");
           // throw new RuntimeException(e);
        }

        System.out.println(c);

    }
}
