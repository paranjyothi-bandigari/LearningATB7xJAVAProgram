package ex_26072024;

import java.util.Scanner;

public class Lab086 {
    public static void main(String[] args) {
        // Write a program name, age, salary - print it
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.next();
        System.out.println("Enter your name");
        int age=sc.nextInt();
        System.out.println("Enter your name");
        double salary=sc.nextDouble();

        System.out.println("My name is" +name);
        System.out.println("My age is" +age);
        System.out.println("My salary is" +salary);

sc.close();
    }
}
