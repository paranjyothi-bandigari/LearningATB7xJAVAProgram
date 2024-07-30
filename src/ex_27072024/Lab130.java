package ex_27072024;

import java.util.Scanner;

public class Lab130 {
    public static void main(String[] args) {
        // Where we take the user input of the 5 subjects - Avg of the subject.
        // Figure inputs - float, scanner class
        float[] subjects = new float[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 subjects:");

        for (int i = 0; i < subjects.length; i++) {
            subjects[i] = sc.nextFloat();
        }

        // Optionally, you might want to display the entered subjects
        System.out.println("Entered subjects:");
        for (float subject : subjects) {
            System.out.println(subject);
        }
        double average=(subjects[0]+subjects[1]+subjects[2])/3;
        System.out.println(average);
        sc.close();
    }
    }

