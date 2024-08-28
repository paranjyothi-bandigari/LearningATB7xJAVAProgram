package ex_11082024.InterfaceEx.Carex2;

public class Cars implements E{
    @Override
    public void StartEngine() {
        System.out.println("StartEngine");
    }

    @Override
    public void StopEngine() {
        System.out.println("StopEngine");
    }

    @Override
    public void m2() {
        System.out.println("M2");
    }
}
