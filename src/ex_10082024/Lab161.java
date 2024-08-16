package ex_10082024;

public class Lab161 {
    public static void main(String[] args) {
        VWOLogin vwoLogin=new VWOLogin("admin","admin123");
        System.out.println(vwoLogin.Password);
        vwoLogin.Password="123";
        System.out.println(vwoLogin.Password);


    }
}
class VWOLogin{
public String name;
public String Password;

    public VWOLogin(String name, String password) {
        this.name = name;
        Password = password;
    }
}

