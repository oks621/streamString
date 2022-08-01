package main.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class StreamString {
    public void metod1(String[] list) {
        IntStream.range(0, list.length)
                .filter(i -> i % 2 == 0)
                .mapToObj(i -> i + 1 + "." + list[i] + " ")
                .forEach(System.out::print);

    }

    public void metod2(String[] list) {
        List<String> list1 = Arrays.stream(list)
                .sorted((o1, o2) -> -o1.compareTo(o2))
                .collect(Collectors.toList());
        list1.stream()
                .map(String::toUpperCase)
                .forEach(s -> System.out.print("\n" + s));
    }
}
