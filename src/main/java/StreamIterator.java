package main.java;

import java.util.stream.Stream;

public class StreamIterator {
    public Stream<Long> streamIterator(long a, long c, long m, long seed) {

        Stream<Long> iterate = Stream.iterate(seed, x -> (a * x + c) % m).limit(10);
        iterate.forEach(s -> System.out.print(s + " "));
        System.out.println();
        Stream.iterate(new Long[]{seed, a, c, m}, n -> new Long[]{(n[1] * n[0] + n[2]) % n[3], n[1], n[2], n[3]})
                .map(n -> n[0]).limit(10).forEach(s -> System.out.print(s + " "));


        return iterate;
    }
}
