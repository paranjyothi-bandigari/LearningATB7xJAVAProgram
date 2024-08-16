package ex_04082024;

public class ATBPerson {
    String name;
    long phoneNo;

    ATBPerson() {
        System.out.println("i am DC");
    }

     ATBPerson(String GivenName) {
        this.name=GivenName;
    }

     ATBPerson(String pname, long pphoneNo) {
        this.name = pname;
        this.phoneNo = pphoneNo;
    }
}
