package ex_04082024.MultilevelInheritance;

public class Lab155 {
    public static void main(String[] args) {
        // grand father -- father --  son
        // priority -- Son -- Father -- Grand father
        Son son=new Son();
        son.bhk2();
        son.bhk1();
        son.bhk3();

        son.extra(); // son dont have extra so it is cmng from father class using multilevel inheritance
    }
}
