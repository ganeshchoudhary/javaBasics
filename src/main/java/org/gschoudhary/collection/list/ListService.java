package org.gschoudhary.collection.list;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class ListService {
    public static void main(String[] args) {
//        array list maintains the insertion order since its array based and indexing is increased with insertions
//        unlike hashset or Hashmap;
        List<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(104);
        list.add(105);
        list.add(102);
        System.out.println(list);

        /*
        All of the operations perform as could be expected for a doubly-linked list.
         Operations that index into the list will traverse the list from the beginning or the end,
          whichever is closer to the specified index.
         */
        list = new LinkedList<>();

    }
}
