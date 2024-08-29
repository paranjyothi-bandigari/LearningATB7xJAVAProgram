package ex_17082024;

public class Lab178 {
    public static void main(String[] args) {
        String num="10";
        //int a=(int)num; string to primitive data type is not possible

        Integer B=Integer.valueOf(num); // string to wrapper class is possible
        System.out.println(B);
// String to primitive -- converting string into Integer then convert it into int
        int a2=Integer.parseInt(num);
        System.out.println(a2);
    }
}
