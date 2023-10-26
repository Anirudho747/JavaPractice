package linkedList;

import java.util.*;

public class Tasks {

    public static LinkedList<Integer> intLL = new LinkedList<>();

    public static void add_remove_iterate_reverse() {
        intLL.add(1);
        intLL.add(2);
        intLL.add(3);
        intLL.add(4);
        intLL.add(5);
        intLL.add(6);
        intLL.add(7);
        intLL.add(8);
        intLL.add(9);
        intLL.add(10);
        intLL.add(11);
        intLL.add(12);

        for (Integer in : intLL) {
            System.out.println(in);
        }

        System.out.println("_______Adding normally,using index,first and last_______");

        intLL.add(3,83);

        intLL.addFirst(2023);

        intLL.add(2,2011);

        intLL.addLast(2027);

        intLL.addLast(2039);

        Iterator<Integer> itr = intLL.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

        System.out.println("_______Removing using index,first and last ,first Occurence and last occurence_______");

        intLL.remove(9);
        intLL.removeFirstOccurrence(9);
        intLL.removeLastOccurrence(9);
        intLL.removeLastOccurrence(12);
        intLL.removeLast();

        System.out.println("___________Descending Iterator______________");

        Iterator<Integer> itrRev = intLL.descendingIterator();
        while (itrRev.hasNext())
        {
            System.out.println(itrRev.next());
        }

        System.out.println("____________Linked List reversed________________");

        intLL.sort(Comparator.reverseOrder());

        for (Integer in : intLL) {
            System.out.println(in);
        }

    }

    public static void poll()
    {

    }


    public static void main(String[] args)
    {
        add_remove_iterate_reverse();


    }



}
