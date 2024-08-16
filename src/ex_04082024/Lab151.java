package ex_04082024;

public class Lab151 {
    public static void main(String[] args) {
        BankAccount ba=new BankAccount();
        System.out.println(ba.bankName);
        System.out.println(ba.balance);
        System.out.println(ba.bankCode);

        BankAccount ba1=new BankAccount("ICICI",50000,"ICICI01");
        System.out.println(ba1.bankCode);
        System.out.println(ba1.balance);
        System.out.println(ba1.bankName);
    }
}
