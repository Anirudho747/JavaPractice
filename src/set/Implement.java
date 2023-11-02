package set;

import java.util.HashSet;
import java.util.Set;

public class Implement {

    public static Set<Integer> a = new HashSet<Integer>();
    public static Set<Integer> b = new HashSet<Integer>();

    public static void main(String[] args)
    {
        a.add(2);                      a.add(4);
        a.add(6);                      a.add(2);
        a.add(10);                     a.add(12);
        a.add(14);                     a.add(18);
        a.add(18);                     a.add(10);
        a.add(20);                     a.add(11);

        b.add(1);                      b.add(3);
        b.add(5);                      b.add(5);
        b.add(10);                     b.add(12);
        b.add(13);                     b.add(18);
        b.add(17);                     b.add(20);
        b.add(20);                     b.add(11);

/////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Union
        Set<Integer> union = new HashSet<>(a);

        System.out.println(union);

        union.addAll(b);

        System.out.println("Union Operation  :  "+union);

/////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Intersection
        Set<Integer> intersection = new HashSet<>(a);

        System.out.println(intersection);

        intersection.retainAll(b);

        System.out.println("Intersection Operation  :  "+intersection);

/////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Symmetric Difference
        Set<Integer> difference = new HashSet<>(a);

        System.out.println(difference);

        difference.removeAll(b);

        System.out.println("Difference Operation  :  "+difference);
    }
}
