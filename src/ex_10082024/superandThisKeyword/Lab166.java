package ex_10082024.superandThisKeyword;

public class Lab166 {

    // super()
    //1. Use of super with Variables
    //2. Use of super with Methods
    //3. Use of super with constructors

    // super keyword in Java is a reference variable that allows
    // a subclass - child class
    // to refer to its parent class.

    public static void main(String[] args) {
        Car car=new Car();
        car.display();
    }
}

class Car extends Vehicle{
    public Car() {
        super();
        System.out.println("child DC");
    }

    private int maxspeed=280;

    void display(){
        System.out.println("this is my class speed" +this.maxspeed);
        System.out.println("this is my parent class speed" +super.maxspeed);
        this.message();
        super.message();
    }

    @Override
    void message(){
        System.out.println("Message");
    }

}
class Vehicle{
    public Vehicle() {

        System.out.println("parant DC");
    }

    int maxspeed=180;

void message(){
    System.out.println("Message");
}

}
