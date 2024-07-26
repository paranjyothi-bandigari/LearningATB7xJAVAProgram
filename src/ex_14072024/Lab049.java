package ex_14072024;

public class Lab049 {
    public static void main(String[] args) {
        int a=10;
        System.out.println(++a + a++ +  a++);
        //A = exp1 =11 , a=11
        //+
        //B = exp2 =11 , a=12
        //+
        //C = exp3 =12 , a=13
        //A=B+C= exp1+exp2+exp3 = 11+11+12 = 34
    }
}
