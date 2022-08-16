package main.java;

import java.util.Iterator;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class StreamString {

    public void metod1(String[] list) {
        IntStream.range(0, list.length)
                .filter(i -> i % 2 == 0)
                .mapToObj(i -> i + 1 + "." + list[i] + " ")
                .forEach(System.out::print);

    }
}