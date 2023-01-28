package org.gschoudhary.utils.serialization;

import lombok.ToString;

import java.io.Serializable;

@ToString
public class User implements Serializable {
    String name;
    String age;

}
