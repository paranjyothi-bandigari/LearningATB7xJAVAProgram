package ex_10082024.Polymorphism.methodoverloading;

public class Lab164 {
    public static void main(String[] args) {
        mathOperations mo=new mathOperations();
       int result= mo.add(2,3);
        System.out.println(result);

        double result1= mo.add(2.6,3);
        System.out.println(result1);

        String result2= mo.add("paran","3");
        System.out.println(result2);
    }
}
