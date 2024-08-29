package ex_18082024.CollectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab216 {
    public static void main(String[] args) {
        List<String> names= new ArrayList();
        names.add("Eesha");
        names.add("Paran");

        for (String str: names) {
            System.out.println(str);

        }
        System.out.println("---------------");
        for (int i = 0; i < names.size() ; i++) {
            System.out.println(names.get(i));

        }
        System.out.println("---------------");
        Iterator<String> itr= names.iterator();
        while (itr.hasNext());
        System.out.println(itr.next());
    }
}
