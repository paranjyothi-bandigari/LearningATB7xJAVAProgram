package ex_17082024;

public class Lab190 {
    //JVM will be Initialized
    //Creates and Starts the main Thread. - Main Called
    //1)Collects the Command Line Arguments
    //2)Creates the String array with CLI
    //3. Lab209.main(0)
    //Now Control will be transferred from main Thread to main method
    // When problem comes in main -> JVM
    // If don't handle the exception JVM -
    // Exception a=new Exception() and terminate the program.  G
    public static void main(String[] args) {
        String ip=args[0];
        Integer a=Integer.parseInt(ip); //unboxing
        Integer b=100/a;
        System.out.println(b);
        System.out.println(ip);


    }

}
