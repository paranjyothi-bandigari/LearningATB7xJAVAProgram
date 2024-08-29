package ex_18082024.CollectionsFramework;

import java.util.ArrayList;

public class Lab210 {
    public static void main(String[] args) {
        // Collections Framework
        // Collection - Interface
        // Collection(I) -> List (I)
        // List (I) -> ArrayList, LinkedList, Vector, Stack

        // Shopping List, Marks List, Collection of items, Todo List, Student List.
//        Collection mylist3 = new ArrayList(); //  Dynamic Dispatch
//        List mylist = new ArrayList(); //  Dynamic Dispatch
//

        ArrayList al=new ArrayList();
        al.add("paran");
        al.add("jyothi");
        al.add("Nag");
        al.add("eesha");
        al.add(123);
        System.out.println(al.size());
        System.out.println(al.contains("eesha"));
        System.out.println(al.get(0));
        System.out.println(al);





    }
}
