package ex_10082024.superandThisKeyword;

public class Lab167 {
}


class Student extends Person{
    void display(){
        super.message();
    }
}
class Person{
    public Person() {
        System.out.println("DC");
    }
    void message(){
        System.out.println("message");
    }
}
