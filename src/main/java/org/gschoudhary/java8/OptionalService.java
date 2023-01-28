package org.gschoudhary.java8;

import java.util.Optional;
// it also helps user to know that return value might be null so user can take care of those scenarios
//
public class OptionalService {
    public static void main(String[] args) {
        Optional<Integer> integer = Optional.ofNullable(10);
    }
}
