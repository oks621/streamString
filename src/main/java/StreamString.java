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
        Arrays.stream(list)
                .sorted((o1, o2) -> -o1.compareTo(o2))
                .map(String::toUpperCase)
                .forEach(s -> System.out.print("\n" + s));
        ;
    }

    public void metodStream(String[] array) {
        Arrays.stream(String.join(",", array).replace(", ", ",").split(","))
                .mapToInt(Integer::parseInt)
                .sorted()
                .mapToObj(String::valueOf)
                .forEach(s -> System.out.print(s + ","));
    }
}
