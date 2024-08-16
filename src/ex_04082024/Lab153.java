package ex_04082024;

import java.util.Scanner;

public class Lab153 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter bank name");
       String bName=sc.next();
        System.out.println("Please enter bank balance");
       int bal=sc.nextInt();
        System.out.println("Please enter bank code");
       String bCode=sc.next();
        BankAccount ba1 = new BankAccount(bName,bal,bCode);
        ba1.printDetails();

        sc.close();
    }
}
