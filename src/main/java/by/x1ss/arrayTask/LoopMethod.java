package by.x1ss.arrayTask;

public class LoopMethod {
    private final int[] array;

    public LoopMethod(int[] array) {
        this.array = array;
    }

    public int[] getArray(){
        return array;
    }

    public int[] getCountPositiveSumNegative(){
        if(array == null || array.length == 0){
            return new int[]{0, 0};
        }
        int countPositive = 0;
        int sumNegative = 0;
        for (int i : array) {
            if (i > 0) {
                countPositive++;
            } else if (i < 0) {
                sumNegative += i;
            }
        }
        return new int[]{countPositive, sumNegative};
    }
}
