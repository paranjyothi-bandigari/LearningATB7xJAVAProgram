package ex_10082024.Encapsulation;

public class Lab162 {
    public static void main(String[] args) {
        VWOLogin1 vwoLogin1=new VWOLogin1("admin","admin123");
        vwoLogin1.getName();
        vwoLogin1.getPassword();
        vwoLogin1.setName("Paran");
        vwoLogin1.setPassword("Paran123",true);
        System.out.println(vwoLogin1.getName());
        System.out.println(vwoLogin1.getPassword());



    }
}
class VWOLogin1{
    private String name;
    private String Password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password, Boolean isAuth) {
        if(isAuth) {
            Password = password;
        }
        else {
            System.out.println("Not allowed to change password");
        }
    }

    public VWOLogin1(String name, String password) {
        this.name = name;
        Password = password;
    }
}

