package ex_27072024;

public class Lab138 {
    public static void main(String[] args) {
        String name="Nagarjuna";
        name="koppala";

        StringBuffer stringBuffer=new StringBuffer("Paran"); // thread safe and slow not used much
       stringBuffer.append("Jyothi");
       stringBuffer.append("Goud");

       StringBuilder stringBuilder=new StringBuilder("Eesha"); // string builder used most as it is not thread safe
       stringBuilder.append("koppala");
       stringBuilder.append("Reddy");

    }
}
