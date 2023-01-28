package org.gschoudhary.utils;

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
