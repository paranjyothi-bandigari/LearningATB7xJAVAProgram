package ex_04082024;

public class Lab149 {
    public static void main(String[] args) {
            ATBPerson atbPerson=new ATBPerson("Paran");
            ATBPerson atbPerson1=new ATBPerson("Eesha");
            System.out.println(atbPerson.name);
            System.out.println(atbPerson1.name);

        ATBPerson atbPerson2=new ATBPerson("Jyothi",9988776543l);
        System.out.println(atbPerson2.name);
        System.out.println(atbPerson2.phoneNo);
    }
}
