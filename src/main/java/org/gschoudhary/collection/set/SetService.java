package org.gschoudhary.collection.set;
import java.util.*;

public class SetService {
    public static void main(String[] args) {
        /*
        This class implements the Set interface, backed by a hash table (actually a HashMap instance).
         It makes no guarantees as to the iteration order of the set; in particular,
         it does not guarantee that the order will remain constant over time. This class permits the null element.
             // Dummy value to associate with an Object in the backing Map

         */
        Set<Integer> set = new HashSet<>();

        /*
        HashSet uses HashMap object internally to store it’s elements
        where as LinkedHashSet uses LinkedHashMap object internally to store and process it’s elements.
         */
        set = new LinkedHashSet<>();


//        treeMap is implemented internally with dummy object
        SortedSet<String> strings = new TreeSet<>((a,b)-> b.length()-a.length() );
        strings.add("hjgjqwwwee");
        strings.add("kjhdikhd");
        strings.add("jdfljf");
        strings.add("adjf");
        System.out.println(strings);


    }
}
