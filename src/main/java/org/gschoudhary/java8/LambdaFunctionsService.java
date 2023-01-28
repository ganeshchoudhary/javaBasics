package org.gschoudhary.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaFunctionsService<T> {
    List<T> list;

    LambdaFunctionsService(List<T> list) {
        this.list = list;
    }

    public List<T> filter(Predicate<T> checkFilter) {
        List<T> newList = new ArrayList<>();
        for (T t : list) {
            if (checkFilter.test(t)) {
                newList.add(t);
            }
        }
        return newList;
    }

    public <R> List<R> mapper(Function<T, R> mapper) {
        List<R> newList = new ArrayList<>();
        for (T t : list) {
            newList.add(mapper.apply(t));
        }
        return newList;

    }

    public void consumer(Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }


}
