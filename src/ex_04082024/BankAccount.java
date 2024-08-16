package ex_04082024;

public class BankAccount {
    String bankName;
    int balance;
    String bankCode; // Instance

    public BankAccount() {
        bankName="SBI";
        balance=0;
        bankCode="SBI001";
    }
    public BankAccount(String bName) {
        this.bankName = bName;

    }
    public BankAccount(String bName, int bal) {
        this.bankName = bName;
        this.balance = bal;

    }

    public BankAccount(String bName, int bal, String bCode) {
        this.bankName = bName;
        this.balance = bal;
        this.bankCode = bCode;
    }

    void printDetails() {
        System.out.println("Bank Name -> " + bankName);
        System.out.println("Bank Code -> " + bankCode);
        System.out.println("Bal ->" + balance);
    }
}
