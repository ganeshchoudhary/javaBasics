package org.gschoudhary.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

public class UtilityService {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(2);
        integers.add(24);
        integers.add(3);
        integers.add(1);
        Collections.sort(integers, (a,b)-> b.compareTo(a) );
        System.out.println(integers);
    }
}
