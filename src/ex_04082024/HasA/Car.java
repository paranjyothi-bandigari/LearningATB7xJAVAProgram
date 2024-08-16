package ex_04082024.HasA;

public class Car {
//Aggregation HasA relation
    public void startCar(){
        new Engine().start();
        new Tyres().rolling();
    }
}
