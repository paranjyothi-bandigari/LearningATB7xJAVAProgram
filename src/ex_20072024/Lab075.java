package ex_20072024;

import java.util.Scanner;

public class Lab075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of 1st side of triangle");
        int side1=sc.nextInt();
        System.out.println("Enter the length of 2st side of triangle");
        int side2=sc.nextInt();
        System.out.println("Enter the length of base side of triangle");
        int baseside=sc.nextInt();


        if(side1==side2 && side2==baseside)      {
            System.out.println("Triangle is equliateral triangle");
        } else if (side1==side2 && side2!=baseside) {
            System.out.println("Triangle is isocilas triangle ");
        } else if (side1!=side2 && side2!=baseside && side1!=baseside) {
            System.out.println("scalar");
        } else {
            System.out.println("not a triangle");
        }
    }
}
