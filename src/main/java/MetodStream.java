package main.java;

import java.util.Arrays;

public class MetodStream {
    public void metodStream(String[] array) {
        Arrays.stream(String.join(",", array).replace(", ", ",").split(","))
                .mapToInt(Integer::parseInt)
                .sorted()
                .forEach(s -> System.out.print(s + " "));
    }

}
