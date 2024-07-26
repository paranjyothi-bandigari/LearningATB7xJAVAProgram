package ex_26072024;

import java.util.Scanner;

public class Lab079 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Character");
        char Vowel=sc.next().charAt(0);


        switch (Vowel) {
            case 'a':
                System.out.println("a is Vowel");
                break;
            case 'e':
                System.out.println("e is Vowel");
                break;
            case 'i':
                System.out.println("i is Vowel");
                break;
            case 'o':
                System.out.println("o is Vowel");
                break;
            case 'u':
                System.out.println("u is Vowel");
                break;
            default:
                System.out.println("Consonant");
                break;
        }

        switch (Vowel){
            case 'a','e','i','o','u' -> System.out.println("Vowel");
            default -> System.out.println("Consonant");
        }
    }
}
