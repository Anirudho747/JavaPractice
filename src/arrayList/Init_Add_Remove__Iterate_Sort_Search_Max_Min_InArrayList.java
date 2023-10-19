package arrayList;

import java.util.*;

public class Init_Add_Remove__Iterate_Sort_Search_Max_Min_InArrayList {

    static List<String> al = new ArrayList<>();
    static List<String> a3 = new ArrayList<>();

    public static void initialise()
    {
        al.add("Asia");
        al.add("North America");
        al.add("South America");
        al.add("Africa");
        al.add("Australia");
        al.add("Europe");
        al.add("Antarctica");

        al.add(0,"Pangea");

        System.out.println(al);
    }

    public static void copyFromAnotherCollection()
    {
        List<String> a2 = new ArrayList<>();
        a2.add("Asia");
        a2.add("North America");
        a2.add("South America");
        a2.add("Africa");
        a2.add("Australia");
        a2.add("Europe");
        a2.add("Antarctica");

        //add all of a collection
        al.addAll(a2);
        System.out.println(al);

        //add all of a collection -2
        List<String> a4 = new ArrayList<>(a2);
        System.out.println(a4);
    }

    public static void remove()
    {
        al.add("Asia");
        al.add("North America");
        al.add("South America");
        al.add("Africa");
        al.add("Australia");
        al.add("Europe");
        al.add("Antarctica");

        //remove element
        al.remove("Australia");
        System.out.println(al.size());
        System.out.println(al);

        //remove index
        al.remove(3);
        System.out.println(al.size());
        System.out.println(al);

        //clean up
        al.clear();
        System.out.println(al.size());
        System.out.println(al);

        al.add("Asia");
        al.add("Africa");
        al.add("Antarctica");
        System.out.println(al.size());
        System.out.println(al);

        //clean up-2
        al.removeAll(al);
        System.out.println(al.size());
        System.out.println(al);
    }

    public static void iteration()
    {
        al.add("Asia");
        al.add("North America");
        al.add("South America");
        al.add("Africa");
        al.add("Australia");
        al.add("Europe");
        al.add("Antarctica");

        //Simple for loop
        for(int i=0;i<al.size();i++)
            {
                System.out.println(i+"  "+al.get(i));
            }

        //for-each loop
        for(String arraylistindi: al)
        {
            System.out.println(arraylistindi);
        }

        //Iterator
        Iterator<String> arrayListIterator = al.iterator();
        while (arrayListIterator.hasNext())
        {
            System.out.println(arrayListIterator.next());
        }

        //ListIterator
        ListIterator<String> arrayListListIterator = al.listIterator(al.size());
        while (arrayListListIterator.hasPrevious())
        {
            System.out.println(arrayListListIterator.previous());
        }

    }

    public static void searching()
    {
        al.add("Africa");
        al.add("North America");
        al.add("South America");
        al.add("Africa");
        al.add("Australia");
        al.add("Europe");
        al.add("Africa");

        //contains method
        System.out.println(al.contains("Africa"));
        System.out.println(al.contains("African"));

        //indexOf method
        System.out.println(al.indexOf("Africa"));
        System.out.println(al.indexOf("African"));

        //LastIndexof method
        System.out.println(al.lastIndexOf("Africa"));
        System.out.println(al.lastIndexOf("African"));
    }

    public static void sorting()
    {
        al.add("Asia");
        al.add("North America");
        al.add("South America");
        al.add("Africa");
        al.add("Africa");
        al.add("Europe");
        al.add("Africa");

        System.out.println(al);

        //sorting using collections method
        Collections.sort(al);
        System.out.println(al);

        a3.add("Asia");
        a3.add("North America");
        a3.add("South America");
        a3.add("Africa");
        a3.add("Africa");
        a3.add("Europe");
        a3.add("Africa");

        //sorting using comparator
        a3.sort(Comparator.naturalOrder());
        System.out.println(a3);

        //Reverse sorting using comparator
        a3.sort(Comparator.reverseOrder());
        System.out.println(a3);

    }

    public static void misc()
    {
        a3.add("Asia");
        a3.add("North America");
        a3.add("South America");
        a3.add("Africa");
        a3.add("Africa");
        a3.add("Europe");

        List<String> a5 = a3.subList(2,5);
        System.out.println(a5);

        List<Integer> a20 = new ArrayList<>();
        List<Integer> a10 = new ArrayList<>();
        a10.add(10);
        a10.add(20);
        a10.add(30);
        a10.add(40);
        a10.add(50);
        a10.add(60);
        a10.add(70);

        Collections.copy(a10,a20);

        System.out.println(a20);
        System.out.println(Collections.max(a10));
        System.out.println(Collections.min(a10));
    }

        public static void main(String[] args)
    {
     //   initialise();
     //   copyFromAnotherCollection();
     //   remove();
     //   iteration();
     //   searching();
     //     sorting();
        misc();


    }
}
