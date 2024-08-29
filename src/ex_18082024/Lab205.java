package ex_18082024;

public class Lab205 {
    public static void main(String[] args) {
        String s1=null;
        if(s1==null){
            throw new RuntimeException("Enter non null sring");
        }
        s1.trim();
    }
}
