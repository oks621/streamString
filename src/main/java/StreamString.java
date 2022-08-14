package main.java;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;


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
                .forEach(s -> System.out.print(s + ","));
    }

    int seed() {

        return new Random().nextInt();

    }

    public void streamIterator(long a, int c, int m, long[] x) {
        x[0] = seed();
       /*
        Это я с цыклом проверяла. Потом удалю
        for (int i = 1; i < 10; i++) {
            x[i] = (a * x[i - 1] + c) % m;
            System.out.print(x[i] + "  ");
     } */
            System.out.println();
        Stream
                .iterate(1, i -> i < 10, i -> i + 1)
                .mapToLong(i -> (a * x[i - 1] + c) % m)
                .forEach(s -> System.out.print(s + "  "));

    }
}