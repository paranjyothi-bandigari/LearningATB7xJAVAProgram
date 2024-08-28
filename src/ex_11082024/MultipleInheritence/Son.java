package ex_11082024.MultipleInheritence;

public class Son implements Mother,Father{
    @Override
    public void House() {
        System.out.println("House");
    }

    @Override
    public void Money() {
        System.out.println("Money");
    }
}
