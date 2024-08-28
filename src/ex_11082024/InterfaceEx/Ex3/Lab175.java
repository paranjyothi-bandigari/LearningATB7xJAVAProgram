package ex_11082024.InterfaceEx.Ex3;

public class Lab175 {
    public static void main(String[] args) {
        Car c=new Car();
        c.start();
        c.gb();
        c.m1();

    }
}
interface E extends keys {
void start();
}

interface GB{
    void gb();
}

interface keys{
    default void m1(){
        System.out.println("m1");
    }
}
class Car implements E,GB{

    @Override
    public void start() {
        System.out.println("Start");
    }

    @Override
    public void gb() {
        System.out.println("GB");
    }
}