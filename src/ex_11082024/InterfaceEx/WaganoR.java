package ex_11082024.InterfaceEx;

public class WaganoR implements Engine{
    void drive(){
        StartEngine();
        StopEngine();
    }

    @Override
    public void StartEngine() {
        System.out.println(" W Start Engine");
    }

    @Override
    public void StopEngine() {
        System.out.println("W Stop Engine");
    }
}
