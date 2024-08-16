package ex_28072024;

public class Lab143 {
    public static void main(String[] args) {
        Bank bank1=new Bank();
        Bank bank2=new Bank();

        bank1.name="SBI";
        bank2.name="ICICI";

        System.out.println(bank1.name);
        System.out.println(bank2.name);
        bank1.balance="500";
        System.out.println(bank1.balance);
        System.out.println(bank2.balance);
    }
}
