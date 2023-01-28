package org.gschoudhary.collections.map;

import java.util.*;

public class MapService {
    public static void main(String[] args) {

        /*
         hashmap based on array of LL nodes (implement interface Entry<K,V>)
        Set<Map.Entry<K, V>> entrySet();
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
         */
        Map<String, String> map = new HashMap<>();


        /*
         * it maintains a doubly-linked list running through
         * all of its entries.  This linked list defines the iteration ordering,
         * which is normally the order in which keys were inserted into the map
         * (<i>insertion-order</i>).  Note that insertion order is not affected
         * if a key is <i>re-inserted</i> into the map.
         */
        map = new LinkedHashMap<>();
        map.put("test", "test");
        /*
         * This class implements a hash table, which maps keys to values. Any non-null object can be used as a key or as a value.
         * To successfully store and retrieve objects from a hashtable, the objects used as keys must implement the hashCode method and the equals method.
         */
        map = new Hashtable<>();

        /*
        HashMap is non-syncronized and is not thread safe while HashTable is thread safe and is synchronized.
        HashMap allows one null key and values can be null whereas HashTable doesn't allow null key or value.
        HashMap is faster than HashTable.
        HashMap iterator is fail-safe where HashTable iterator is not fail-safe.
         */


        /*
        This implementation provides guaranteed log(n) time cost for the containsKey, get, put and remove operations.
         */
        SortedMap<String, String> map1 = new TreeMap<>((a, b) -> b.compareTo(a));
        map1.put("a", "add");
        map1.put("1", "add");
        map1.put("d", "add");
        map1.put("c", "add");
        Set<Map.Entry<String, String>> entry = map1.entrySet();
        for (Map.Entry<String, String> a : entry) {
            System.out.println(a);
        }

    }
}
