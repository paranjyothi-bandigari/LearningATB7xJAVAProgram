package ex_17082024;

public class Lab195 {
    public static void main(String[] args) {
        final double pi = 3.14;
        int a= 0;
        try {
            int x = 10/a;
        } catch (Exception e) {
            System.out.println("Div by 0");
            //throw new RuntimeException(e);
        } finally {
            System.out.println("Finally");
        }


    }
}
