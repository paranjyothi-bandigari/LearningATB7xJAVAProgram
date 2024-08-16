package ex_10082024.Encapsulation;

public class ICICIBank {
    private String name;
    private int balance;

    public ICICIBank(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name, boolean admin) {
        // set balance is allowed for only admin
        if(admin) {
            this.name = name;
            System.out.println("Name updated");
        }else {
            System.out.println("Access denied");
        }
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance, boolean admin) {
        // set balance is allowed for only admin
      if(admin) {
          this.balance = balance;
          System.out.println("balance updated");
      }else {
          System.out.println("Access denied");
      }
    }
}
