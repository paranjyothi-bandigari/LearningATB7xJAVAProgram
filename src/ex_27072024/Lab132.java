package ex_27072024;

public class Lab132 {
    public static void main(String[] args) {
        // Find the Max in the Arrays
        // Find the Max Salary, Min  in the Salary Array
        int[] salaries = {7, 10, 4, 13, 25, 18, 9, 8, 17};
        // Infsys - Autoamtion Interview
        int max = salaries[0];
        int min = salaries[0];
        for(int i=0;i<salaries.length;i++){
            if(salaries[i]>max){
                max=salaries[i];
            }
            if(salaries[i]<min){
                min=salaries[i];
            }

        }
        System.out.println(max);
        System.out.println(min);

    }
}
