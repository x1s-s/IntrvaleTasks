package by.x1ss.arrayTask;

import java.util.stream.Collector;
import java.util.stream.IntStream;

public class StreamMethod {
    private int[] array;

    public StreamMethod(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public int[] countPositiveSumNegative() {
        if (array == null || array.length == 0) {
            return new int[0];
        }
        return IntStream.of(array).boxed().collect(Collector.of(() -> new int[2], (a, i) -> {
            a[0] += i > 0 ? 1 : 0;
            a[1] += Math.min(i, 0);
        }, (a1, a2) -> {
            a1[0] += a2[0];
            a1[1] += a2[1];
            return a1;
        }));
    }
}

