package ex_17082024;

public class Lab196 {
    public static void main(String[] args) {
        try {
            int a=10/0;
        } catch (ArithmeticException e) {
            //throw new RuntimeException(e);
            System.out.println("Div by Zero");
        } finally {
            System.out.println("I will execute anyways");
        }

    }
}
