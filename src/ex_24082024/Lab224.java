package ex_24082024;

import java.util.*;


public class Lab224 {
    public static void main(String[] args) {
        Set hs=new HashSet(); // no order
        hs.add("Apple");
        hs.add("mango");
        hs.add("mango");
        hs.add("watermelon");
        hs.add(null);
        System.out.println(hs);

        Set lhs=new LinkedHashSet(); // linked list mechanaism
        lhs.add("Apple");
        lhs.add("mango");
        lhs.add("watermelon");
        lhs.add(null);
        System.out.println(lhs);

        Set ths=new TreeSet(); // black n red tree - automatically sort them based on 1st letter
        ths.add("Apple");
        ths.add("mango");
        ths.add("watermelon");
       // ths.add(null); // null is not allowed in treeset

        System.out.println(ths);

        for(Object o:ths){
            System.out.println(o);
        }
        System.out.println("-----");
        Iterator it= ths.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
