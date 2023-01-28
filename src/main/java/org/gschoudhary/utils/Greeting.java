package org.gschoudhary.utils;

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
