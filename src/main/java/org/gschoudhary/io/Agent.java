package org.gschoudhary.io;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
class Agent {
    private String name;

    private int age;

    private String address;

    @Override
    public String toString() {
        return name + ',' + age + "," + address + "\tमैं भूखा हूँ।\uD83D\uDE00";
    }
}
