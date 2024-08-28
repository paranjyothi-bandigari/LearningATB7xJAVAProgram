package ex_11082024.AbstractClassEX.exCar;

public class Waganor extends engine{

    void driveWaganor(){
        start();
        speed();
        stop();
    }

    @Override
    void start() {
        System.out.println("Start");
    }

    @Override
    void stop() {
        System.out.println("stop");
    }

    @Override
    void speed() {
        System.out.println("speed");
    }

    @Override
    void partGearBox() {
        System.out.println("gearbox");
    }

    @Override
    void OpenCar() {
        System.out.println("open car");
    }
}
