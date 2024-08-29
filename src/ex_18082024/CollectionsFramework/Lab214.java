package ex_18082024.CollectionsFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lab214 {
    public static void main(String[] args) {
        List marks=new ArrayList<>();
        marks.add(99);
        marks.add(100);
        marks.add(98);
        marks.add(95);
        marks.add(97);
        marks.add(90);
        marks.add(96);
        System.out.println(marks);
    Collections.sort(marks);
   Collections.sort(marks, Comparator.reverseOrder());
        System.out.println(marks);
       Object a= Collections.max(marks);
       Object b= Collections.min(marks);
        System.out.println(a);
        System.out.println(b);

    }
}
