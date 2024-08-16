package ex_10082024.Polymorphism.methodoverriding;

public class Lab165 {
    public static void main(String[] args) {
        Hound h=new Hound();
        h.bark();
        h.extra();

        Dog d=new Dog();
        d.bark();

        Dog dh=new Hound();
        dh.bark();
        //dh.extra(); // father class reference dont know the child class objects
    }
}
