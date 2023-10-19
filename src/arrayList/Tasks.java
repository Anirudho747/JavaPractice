package arrayList;

import java.util.*;

public class Tasks {

    public static List<String> strAL = new ArrayList<>();
    public static ArrayList<String> intAL = new ArrayList<>();

    public static void add_PrintColors()
    {
        strAL.add("White");
        strAL.add("Black");
        strAL.add("Blue");
        strAL.add("Green");
        strAL.add("Red");
        strAL.add("Yellow");
        strAL.add("Purple");

        System.out.println(strAL);

        Collections.sort(strAL);
        System.out.println(strAL);

        strAL.add(0,"Mauve");

        System.out.println(strAL);

        System.out.println(strAL.get(strAL.size()-3));

        strAL.set(5,"Maroon");

        System.out.println(strAL.get(strAL.size()-3));

        strAL.remove(2);

        System.out.println(strAL);

        System.out.println(strAL.contains("Maroon"));

        System.out.println(strAL.contains("Red"));

        Collections.sort(strAL);

        System.out.println(strAL);

        ArrayList<String> dupliAL = new ArrayList<>(strAL);

        System.out.println(dupliAL);

        dupliAL.sort(Comparator.reverseOrder());

        System.out.println(dupliAL);

        List<String> dupliAL2 = strAL.subList(3, strAL.size()-3);

        System.out.println(dupliAL2);

        System.out.println(dupliAL2);
    }

    public static void iterate() {
        strAL.add("White");
        strAL.add("Black");
        strAL.add("Blue");
        strAL.add("Green");
        strAL.add("Red");
        strAL.add("Yellow");
        strAL.add("Purple");


        for(String colors : strAL)
        {
            System.out.println(colors);
        }

        Iterator<String> it = strAL.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        ListIterator<String> lit = strAL.listIterator();
        while(lit.hasNext())
        {
            System.out.println(lit.next());
        }

        ListIterator<String> litrev = strAL.listIterator(strAL.size()-1);
        while(lit.hasPrevious())
        {
            System.out.println(lit.previous());
        }
    }

    public static void main(String[] args)
    {
        add_PrintColors();
    //    iterate();
    }
}
