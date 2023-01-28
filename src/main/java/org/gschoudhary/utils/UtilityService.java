package org.gschoudhary.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
An enum type is a special data type (class) that enables for a variable to be a set of predefined constants
The variable must be equal to one of the values that have been predefined for it.
an enumeration can have constructor,methods and instance variables
* each constant enum value will be separate object/ instance containing all the methods and instance variables
 */
enum Day {
    SUNDAY("sun", Greeting.GOOD_MORNING), MONDAY("mon", Greeting.GOOD_EVENING);

    Day(String str, Greeting greeting) {
        this.value = str;
        this.greeting = greeting;

    }

    String value;

    Greeting greeting;

    public void setValue(String str) {

        this.value = str;
    }

    public Greeting publish() {
        System.out.println("publishing values");
        return greeting;
    }
}
enum Greeting {
    GOOD_MORNING("good morning"), GOOD_EVENING("good evening");

    private String value;

    Greeting(String value) {
        this.value = value;
    }

    public void printDetails() {
        System.out.println("greeting is " + value);
    }
}
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
