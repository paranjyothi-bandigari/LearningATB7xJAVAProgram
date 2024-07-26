package ex_26072024;

import java.util.Scanner;

public class Lab072 {
    public static void main(String[] args) {
        //max number in 2 inputs

        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st number");
        int number1=sc.nextInt();
        System.out.println("enter 2st number");
        int number2=sc.nextInt();

        //int max=Math.max(number1,number2);
        //System.out.println("Maximum number is -->" +max);

        if(number1>number2){
            System.out.println("Number1 is Greater");
        } else if (number1<number2) {
            System.out.println("Number2 is Greater");

        } else {
            System.out.println("number 1 and 2 are equal");
        }

    }
}
