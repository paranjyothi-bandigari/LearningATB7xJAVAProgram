package ex_10082024.superandThisKeyword;

public class Lab168 {

}

class person{
    public person() {
        System.out.println("DC");
    }

    public person(String a) {
        System.out.println("PC 1 p");
    }

    public person(String b, int c) {
        System.out.println("PC with 2 p");
    }
}

class student extends person{
    public student(String d){
        System.out.println("Child 1PC");
    }
    public student() {
       // this("paran");
        //super();
        //super("paran");
        //super("paran",100);
        System.out.println("Child DC");
    }
}
