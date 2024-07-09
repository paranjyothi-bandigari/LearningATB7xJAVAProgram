package ex_07072024;

public class Lab004 {
    public static void main(String[] args) {
        // static public  void is possible
        // without void it is not entry point
        //public static void main(String args[]) - This is also possible
        System.out.println("we can have multiple main methods but system will recognise only - public static void main(String[]");
    main();
    }


    public static void main() {
//public static void main(String[] a){} - this is also valid main method
        System.out.println(" public static void main() - this is not entry point");
        System.out.println("this will work as a separate method, we can call it in main method");
    }
}
