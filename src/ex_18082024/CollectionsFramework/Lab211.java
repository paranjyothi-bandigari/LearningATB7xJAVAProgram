package ex_18082024.CollectionsFramework;

import java.util.ArrayList;
import java.util.List;

public class Lab211 {
    public static void main(String[] args) {
        int[] a=new int[5];
        a[0]=9;
        a[1]=8;
        a[2]=7;
        a[3]=6;
        a[4]=5;

        for(int i=0;i<a.length;i++){
            if (a[i]==6) {
                System.out.println("Found 6");
            }

        }

        List l=new ArrayList<>();
        l.add(9);
        l.add(8);
        l.add(7);
        l.add(6);
        l.add(5);
        System.out.println(l.contains(6));


    }
}
