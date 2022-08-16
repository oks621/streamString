package main.java;

import java.util.Random;
import java.util.stream.Stream;

public class StreamStrings {
    public static void main(String[] args) {
        String[] list = {"One", "Two", "Three", "Four", "Five", "Six"};
        String[] list1 = {"1, 12, 20", "44, 5"};
        new StreamString().metod1(list);
        new MetodList().metod2(list);
        System.out.println();
        new MetodStream().metodStream(list1);
        System.out.println();
        new StreamIterator().streamIterator(25214903917L, 11, (int) Math.pow(2, 48), new Random().nextInt());
        System.out.println();
        Stream<Integer> second = Stream.of(11, 20, 3, 4);
        Stream<Integer> first = Stream.of(0, 8, 9);
       new StreamStreams().zip(first, second);
    }
}
