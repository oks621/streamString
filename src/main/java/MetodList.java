package main.java;

import java.util.Arrays;

public class MetodList {
    public void metod2(String[] list) {
        Arrays.stream(list)
                .sorted((o1, o2) -> -o1.compareTo(o2))
                .map(String::toUpperCase)
                .forEach(s -> System.out.print("\n" + s));
        ;
    }
}
