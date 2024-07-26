package ex_20072024;

import java.util.Scanner;

public class Lab078 {
    public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            System.out.println("enter Browser");
            String browser=sc.next();
            browser=browser.toLowerCase();

            switch (browser) {
                case "chrome":
                    System.out.println("start the Chrome browser");
                    break;
                case "edge":
                    System.out.println("start the Edge browser");
                    break;
                case "firefox":
                    System.out.println("start the Firefox browser");
                    break;
                case "saffari":
                    System.out.println("start the Saffari browser");
                    break;
                default:
                    System.out.println("Enter correct details");
                    break;
            }
    }
}
