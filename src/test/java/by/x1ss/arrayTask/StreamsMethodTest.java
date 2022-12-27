package by.x1ss.arrayTask;

import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(DataProviderRunner.class)
public class StreamsMethodTest {
    public Object[][] data() {
        return new Object[][]{
                {null, new int[]{0, 0}},
                {new int[0], new int[]{0, 0}},
                {new int[]{1, 2, 3, 4, 5}, new int[]{5, -15}},
                {new int[]{-1, -2, -3, -4, -5}, new int[]{0, -15}},
                {new int[]{1, 2, 3, 4, -5}, new int[]{4, -5}},
                {new int[]{}, new int[]{0, 0}},
                {new int[]{0}, new int[]{0, 0}},
                {new int[]{1}, new int[]{1, 0}},
                {new int[]{-1}, new int[]{0, -1}},
                {new int[]{1, 0, -1}, new int[]{1, -1}},
                {new int[]{0, 0, 0}, new int[]{0, 0}},
                {new int[]{1, 0, 0}, new int[]{1, 0}},
                {new int[]{0, 1, 0}, new int[]{1, 0}},
                {new int[]{0, 0, 1}, new int[]{1, 0}},
                {new int[]{-1, 0, 0}, new int[]{0, -1}},
                {new int[]{0, -1, 0}, new int[]{0, -1}},
                {new int[]{0, 0, -1}, new int[]{0, -1}},
                {new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, new int[]{10, -55}},
                {new int[]{-1, -2, -3, -4, -5, -6, -7, -8, -9, -10}, new int[]{0, -55}},
                {new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, -10}, new int[]{9, -10}},
                {new int[]{1, 2, 3, 4, 5, 6, 7, 8, -9, -10}, new int[]{8, -19}},
        };
    }

    @Test
    @UseDataProvider("data")
    public void countPositiveSumNegative(int[] array, int[] expected) {
        StreamsMethod streamsMethod = new StreamsMethod(array);
        int[] actual = streamsMethod.countPositiveSumNegative();
        Assert.assertArrayEquals(expected, actual);
    }
}
