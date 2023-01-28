package org.gschoudhary.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UtilityService {
    public static void main(String[] args) {

//        enums
        Day day = Day.MONDAY;
        day.publish().printDetails();
//        get instance name as string
        System.out.println(day.name());
//        get instance from string value
        System.out.println(Day.valueOf("SUNDAY"));
//        get all the instances in an array
        Day[] days = Day.values();


        List<Integer> integers = new ArrayList<>();
        integers.add(2);
        integers.add(24);
        integers.add(3);
        integers.add(1);
        Collections.sort(integers, (a, b) -> b.compareTo(a));
        System.out.println(integers);
    }
}
