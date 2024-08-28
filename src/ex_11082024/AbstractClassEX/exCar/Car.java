package ex_11082024.AbstractClassEX.exCar;



public class Car extends engine {
    @Override
    void start() {
        System.out.println("start the car");
    }

    @Override
    void stop() {
        System.out.println("stop the car");
    }

    @Override
    void speed() {
        System.out.println("speed is");
    }


    @Override
    void partGearBox() {
        System.out.println("open Gearbox");
    }

    @Override
    void OpenCar() {
        System.out.println("open car with keys");
    }

    //  keys
    //engine
    //gear box

    // tesla is a car and drive() method


}
