package ex_04082024;

public class Lab150 {
    public static void main(String[] args) {
        ATBPerson p0 = new ATBPerson();
        ATBPerson p1 = new ATBPerson("Paran");
        ATBPerson p2 = new ATBPerson("Jyothi");
        ATBPerson p3 = new ATBPerson("Bandigari", 976543210);
        System.out.println(p0.name);
        System.out.println(p1.name);

        System.out.println(p2.phoneNo);

        System.out.println(p3.name);
        System.out.println(p3.phoneNo);
    }
}
