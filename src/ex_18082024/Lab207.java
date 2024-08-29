package ex_18082024;

public class Lab207 {
    public static void main(String[] args) {
        String s1=null;
        try {
            if(s1==null){
                throw new RuntimeException("Enter non null sring");
            }
        } catch (NullPointerException e) {
            //throw new RuntimeException(e);
            System.out.println("Null");
        }
        s1.trim();
    }
}
