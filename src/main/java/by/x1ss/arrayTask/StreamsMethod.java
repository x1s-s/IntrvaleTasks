package by.x1ss.arrayTask;

import java.util.Arrays;

public class StreamsMethod {
    private int[] array;

    public StreamsMethod(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public int[] countPositiveSumNegative(){
        if(array == null || array.length == 0){
            return new int[]{0, 0};
        }
        return new int[]{
                (int) Arrays.stream(array).filter(x -> x > 0).count(),
                Arrays.stream(array).filter(x -> x < 0).sum()
        };
    }
}
