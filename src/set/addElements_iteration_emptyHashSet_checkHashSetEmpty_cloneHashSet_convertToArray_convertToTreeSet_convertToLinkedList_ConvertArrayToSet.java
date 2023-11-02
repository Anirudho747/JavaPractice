package set;

import java.util.*;

public class addElements_iteration_emptyHashSet_checkHashSetEmpty_cloneHashSet_convertToArray_convertToTreeSet_convertToLinkedList_ConvertArrayToSet {

    public static Set<Integer> a = new HashSet<>();

    public static void main(String[] args)
    {
        addElements();

        System.out.println(a);

        iteration();

        System.out.println(a.size());

        emptyHashSet();

        System.out.println(a);

        System.out.println(checkHashSetEmpty());

        cloneHashSet();

        convertToArray();

        convertToTreeSet();

        convertToLinkedList();

        ConvertArrayToSet();
    }

    public static void addElements()
    {
        a.add(2);                      a.add(4);
        a.add(6);                      a.add(2);
        a.add(10);                     a.add(12);
        a.add(14);                     a.add(18);
        a.add(18);                     a.add(10);
        a.add(20);                     a.add(11);
    }

    public static void iteration()
    {
        Iterator<Integer> hsi = a.iterator();
        while(hsi.hasNext())
        {
            System.out.println(hsi.next());
        }
    }

    public static void emptyHashSet()
    {
        a.clear();
    }

    public static boolean checkHashSetEmpty()
    {
        return(a.isEmpty());
    }

    public static void cloneHashSet()
    {
        addElements();

        Set<Integer> b = new HashSet<>(a);

        System.out.println(b);
    }

    public static void convertToArray()
    {
        Integer[] arr = new Integer[a.size()];

        a.toArray(arr);

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static void convertToTreeSet()
    {
        TreeSet<Integer> ts = new TreeSet<>(a);

        Iterator<Integer> itr = ts.iterator();

        while (itr.hasNext())
        {
            System.out.print(itr.next()+"    ");
        }
    }

    public static void convertToLinkedList()
    {
        LinkedList<Integer> ll = new LinkedList<>(a);

        Iterator<Integer> itr = ll.descendingIterator();

        System.out.println();

        while (itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }
    }

    public static void ConvertArrayToSet()
    {
        Integer[] intArray = new Integer[]{1,3,5,7,9,11,13,15,17,19};

        Set<Integer> aSet = new HashSet<Integer>(Arrays.asList(intArray));

        Iterator<Integer> lst = aSet.iterator();

        while(lst.hasNext())
        {
            System.out.println(lst.next());
        }

        Set<Integer> bset = new HashSet<>();

        bset.add(2);                      bset.add(4);
        bset.add(6);                      bset.add(2);
        bset.add(10);                     bset.add(12);
        bset.add(14);                     bset.add(18);

        Integer[] bintArray = new Integer[bset.size()];

        bset.toArray(bintArray);

        for(int i=0;i<bintArray.length;i++)
        {
            System.out.println(bintArray[i]);
        }

    }
}
