package ex_18082024;

public class Lan202 {
    public static void main(String[] args) {
        // throw
        // Custom Exception
        Bank sbi = new Bank("INR", 100);
//        Bank icici = new Bank("INR",  10);
//        Integer total = sbi.add(icici);
//        System.out.println(total);

        Bank jpmorgan = new Bank("AED", 89);
        Integer totalnew = sbi.add(jpmorgan);
        System.out.println(totalnew);

    }
}
