package ex_26072024;

import java.util.Scanner;

public class Lab073 {
    public static void main(String[] args) {
        ////        ✅ Grade Calculator:
        ////        Write a program that calculates and displays
        ////        the letter grade for a given numerical
        ////        score (e.g., A, B, C, D, or F)
        ////        based on the following grading scale:
        ////        A: 90-100
        ////        B: 80-89
        ////        C: 70-79
        ////        D: 60-69
        ////        F: 0-59
        //
        //
        //        // 1. Find the user Inputs
        //        // score - data type? - int -90
        //        // return -> grade - data-type - char  - A
        //        //         // // DAA- Ask for the confirmation of the doubts
        //        // Interviewer ->  int, char
        //        // Scanner - >
        //
        //        // 2. Basic Logic
        //        // if ( score >= 90 && score <= 100 ) -> return or print grade - A
        //        // else if score <=89 && score >= 80 -> return or print grade - B
        //        // else if score <=79 && score >= 70 -> return or print grade - C
        //         // D,E
        //        //  // else -> grade -> F
        //
        //
        //        // 3. Write the code

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student Score!!");
        int score=sc.nextInt();
        char grade='F';
        if(score >= 90 && score <= 100)      {
            System.out.println("A");
        } else if (score <=89 && score >= 80) {
            System.out.println("B");
        } else if (score <=79 && score >= 70) {
            System.out.println("C");
        } else if (score <=69 && score >= 60) {
            System.out.println("D");
        } else if (score <=59 && score >= 50) {
            System.out.println("E");
        }else if (score <=0 || score >100)    {
                System.out.println("you are god");
        }else {
            System.out.println("F");
        }

    }
}
