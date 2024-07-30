package ex_27072024;

import java.util.Arrays;

public class Lab134 {
    public static void main(String[] args) {
        // Find the Max in the Arrays
        // Find the Max Salary, Min  in the Salary Array
        int[] salaries = {7, 10, 4, 13, 25, 18, 9, 8, 17};
        Arrays.sort(salaries);
        System.out.println("max is " +salaries[salaries.length-2]);
    }
}
