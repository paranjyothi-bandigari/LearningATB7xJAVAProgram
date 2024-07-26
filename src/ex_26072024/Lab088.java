package ex_26072024;

import java.util.Scanner;

public class Lab088 {
    public static void main(String[] args) {

            // Program to Check
            // if a Number is Positive
            // , Negative,
            // or Zero.


            Scanner sc = new Scanner(System.in);
            System.out.println("Enter yur number!");
            int num = sc.nextInt();

            if(num>0){
                System.out.println("Number is positive");
            } else if (num<0) {
                System.out.println("Number is negative");
            }
            else {
                System.out.println("number is zero");
            }
    }
}
