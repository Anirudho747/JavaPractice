package linkedList;

import java.util.*;

public class Init_Add_Remove_Iterate_Reverse_Poll_Peek_Offer_Index {

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

    public static void polling_DisplayAndRemove()
    {
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

        //Default Poll
        System.out.println(intLL.poll());
        System.out.println(intLL);

        //Poll first
        System.out.println(intLL.pollFirst());
        System.out.println(intLL);

        //Poll last
        System.out.println(intLL.pollLast());
        System.out.println(intLL);
    }

    public static void peeking_DisplayDontRemove()
    {
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

        System.out.println(intLL.peek());
        System.out.println(intLL);

        System.out.println(intLL.peekFirst());
        System.out.println(intLL);

        System.out.println(intLL.peekLast());
        System.out.println(intLL);
    }

    public static void offer_AddElement()
    {
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

        intLL.offer(001);
        System.out.println(intLL);

        intLL.offerFirst(01);
        System.out.println(intLL);

        intLL.offerLast(100);
        System.out.println(intLL);
    }

    public static void index_ReturnPosition()
    {
        intLL.add(1);
        intLL.add(2);
        intLL.add(3);
        intLL.add(1);
        intLL.add(2);
        intLL.add(3);
        intLL.add(1);
        intLL.add(2);
        intLL.add(3);
        intLL.add(1);
        intLL.add(3);
        intLL.add(2);

        System.out.println(intLL.indexOf(1));
        System.out.println(intLL.lastIndexOf(1));

        System.out.println(intLL.indexOf(2));
        System.out.println(intLL.lastIndexOf(2));

        System.out.println(intLL.indexOf(3));
        System.out.println(intLL.lastIndexOf(3));
    }
        public static void main(String[] args)
    {
         // add_remove_iterate_reverse();
        //  polling_DisplayAndRemove();
        //  peeking_DisplayDontRemove();
        //  offer_AddElement();
            index_ReturnPosition();
    }



}
