package ex_10082024;

import ex_10082024.Encapsulation.ICICIBank;

public class Lab163 {
    public static void main(String[] args) {
        ICICIBank amit=new ICICIBank("joe",76598);
        amit.setName("Arjun",false);

        ICICIBank paran=new ICICIBank("paran",76598);
        paran.setBalance(987654,true);

    }
}
