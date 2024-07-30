package ex_27072024;

import java.util.Scanner;

public class Lab123 {
    public static void main(String[] args) {
    int[] age=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter 5 numbers");
        age[0]=sc.nextInt();
        age[1]=sc.nextInt();
        age[2]=sc.nextInt();
        age[3]=sc.nextInt();
        age[4]=sc.nextInt();

        for(int i=0;i<age.length;i++) {
            System.out.println(age[i]);
        }
    }
}
