package ex_27072024;

import java.util.Scanner;

public class Lab129 {
    public static void main(String[] args) {
        // Where we take the user input of the 5 subjects - Avg of the subject.
        // Figure inputs - float, scanner class
float[] subjects=new float[3];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 subjects");
        subjects[0]=sc.nextFloat();
        subjects[1]=sc.nextFloat();
        subjects[2]=sc.nextFloat();

        double average=(subjects[0]+subjects[1]+subjects[2])/3;
        System.out.println(average);
sc.close();
    }
}
