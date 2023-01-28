package org.gschoudhary.utils.annotations;

public class AnnotationService {
    public static void main(String[] args) {
        Employee employee = new Employee();

        if(employee.getClass().isAnnotationPresent(ImportantClass.class)){
            System.out.println("done");
        }

    }
}
