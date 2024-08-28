package ex_11082024.StaticKeyWord;

public class Lab176 {
    // Static
    // block
    // Data member
    // Function
    // Class
    public static void main(String[] args) {
        System.out.println(ATB.CourseName);
        ATB atb = new ATB("Paran");
        System.out.println(atb.getName());

        ATB atb2 = new ATB("Jyothi");
        System.out.println(atb.getName());

        ATB.DoAssignment();

    }
}

class ATB{

    {
        System.out.println("IIB");
    }

    static{
        System.out.println("Static block");
    }
private String Name;
static String CourseName="ATB";

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }


    public ATB(String name) {
        this.Name = name;
    }

    static void DoAssignment(){
        System.out.println("DoAssignment");
    }

}
