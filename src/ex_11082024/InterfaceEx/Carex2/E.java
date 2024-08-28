package ex_11082024.InterfaceEx.Carex2;

public interface E {
    void StartEngine();
    void StopEngine();
    // Interface can have static and default methods
    default void HaltingEngineJustStart(){
        System.out.println("HaltingEngineJustStart");
    }

    default void HaltingEngineJustStop(){
        System.out.println("HaltingEngineJustStop");
    }
    static void M1(){
        System.out.println("M1");
    }
// interface can have incomplete methods
    void m2();


    //interface class can have complete methods

    // void m3(){
    //    System.out.println("m3");
    //}
}
