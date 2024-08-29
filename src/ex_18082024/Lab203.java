package ex_18082024;

import java.util.Scanner;

public class Lab203 {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();
        if (name.equalsIgnoreCase("Paran")){
            try {
                throw new Exception("Not allowed!!");
            } catch (Exception e) {
                System.out.println("Exception!!");
            }
        }else {
            System.out.println("Allowed!");
        }
    }
}
