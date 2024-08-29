package ex_18082024;
//Exception Passing
public class Lab198 {
    public static void main(String[] args) {
        extracted();
    }

    private static void extracted() {
        extracted1();
    }

    private static void extracted1() {
        try {
            Integer[] i=new Integer[2];
            System.out.println(i[3]);
        } catch (Exception e) {
            System.out.println("ArrayIndexOutOfBoundException");
            //throw new RuntimeException(e);
        }
    }
}
