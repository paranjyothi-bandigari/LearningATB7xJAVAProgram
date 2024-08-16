package ex_04082024;

public class Lab152 {
    public static void main(String[] args) {
        BankAccount ba=new BankAccount();

        BankAccount ba1=new BankAccount("ICICI",50000,"ICICI01");

        ba.printDetails();
        ba1.printDetails();
    }
}
