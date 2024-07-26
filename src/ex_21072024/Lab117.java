package ex_21072024;

public class Lab117 {
    public static void main(String[] args) {
        int i=10;
        System.out.println("While Loop");
        while (i<10){
            System.out.println(i);
            i++;
        }

        System.out.println("Do-While Loop");
        do {
            System.out.println(i);
            i++;
        }
        while (i<10);
    }
}
