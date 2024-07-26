package ex_26072024;

public class Lab085 {
    public static void main(String[] args) {
        char code='A';

        int Val=switch(code){
            case 'A': yield 65;
            case 'B': yield 66;

            default : throw new IllegalStateException("Unexpected value: " + code);
                };
        System.out.println(Val);
    }
}
