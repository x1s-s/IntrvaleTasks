package by.x1ss.arrayTask;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(DataProviderRunner.class)
public class StreamsMethodTest {
    @DataProvider
    public static Object[][] data() {
        return new Object[][]{
                {null, new int[0]},
                {new int[0], new int[0]},
                {new int[]{1, 2, 3, 4, 5}, new int[]{5, 0}},
                {new int[]{-1, -2, -3, -4, -5}, new int[]{0, -15}},
                {new int[]{1, 2, 3, 4, -5}, new int[]{4, -5}}
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
