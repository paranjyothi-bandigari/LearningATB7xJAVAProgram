package ex_14072024;

public class Lab048 {

    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + ++a);
        System.out.println(a);
        // A - a++  -> Exp = 11 | a = 11
        // + - operator
        // B- a++  -> Exp = 12| a = 12
        // Exp = A+B = 23 , a = 12
    }
}
