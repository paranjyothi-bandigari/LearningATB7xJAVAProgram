package ex_25072024;

public class Lab043 {
    public static void main(String[] args) {
        //pre and post increment ++a and a++

        //  pre increment - increase 1st and then assign value
        int preinc_a=10;
        int Exp1=++preinc_a;
        System.out.println(preinc_a);
        System.out.println(Exp1); // exp is 11 and preinc_a is also 11


        // post increment - assign 1st then increase
        int postinc_a=10;
        int Exp2=postinc_a++;
        System.out.println(postinc_a);
        System.out.println(Exp2); // exp is 10 and postinc_a is 11
    }
}
