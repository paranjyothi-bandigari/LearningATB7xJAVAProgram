package ex_10082024.Polymorphism.methodoverriding;

public class Hound extends Dog{
    @Override
    void bark(){
        System.out.println("Hound Barking");
    }

    void extra(){
        System.out.println("extra");
    }
}
