package main.java;

import java.util.Iterator;
import java.util.stream.Stream;

public class StreamStreams<T> {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> i1 = first.iterator();
        Iterator<T> i2 = second.iterator();
        Stream<T> e = Stream.empty();
        while (i1.hasNext() & i2.hasNext()) {
            e = Stream.concat(e, Stream.of(i1.next(), i2.next()));
        }
        e.forEach(System.out::println);

        return e;
    }
}
