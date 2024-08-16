package ex_10082024.Encapsulation;

public class VWOLoginpage {
   private String userName;
    private String password;
    private String signInButton;
    //## Encapsulation
    //- Encapsulation is a fundamental concept in object-oriented programming (OOP).
    //- Bundling of data and methods that operate on that data within a single unit.
    //- Data members should be private in nature.
    //- Methods with getter and setter only, you can access the data members / attributes.
    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getSignInButton() {
        return signInButton;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
