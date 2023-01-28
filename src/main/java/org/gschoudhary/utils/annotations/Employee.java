package org.gschoudhary.utils.annotations;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ImportantClass
public class Employee {

    private String name;
    private String age;

    @ImportantClass
    public void getDetails(){
        System.out.println("getting details ");
    }
}
