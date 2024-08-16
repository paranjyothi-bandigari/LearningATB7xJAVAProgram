package ex_04082024.AccessModifiers.Police;

public class Cop {
    private int gun;
    private int idCard;

    public Cop(int gun) {
        this.gun = gun;
    }

    protected void canIShoot(){
        System.out.println("Yes - you can shoot");
    }


}
