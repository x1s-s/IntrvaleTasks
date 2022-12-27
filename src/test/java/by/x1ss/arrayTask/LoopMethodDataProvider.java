package by.x1ss.arrayTask;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(DataProviderRunner.class)
public class LoopMethodDataProvider {
    @DataProvider
    public static Object[][] data() {
        return new Object[][]{
                {null, new int[0]},
                {new int[0], new int[0]},
                {new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, new int[]{10, 0}},
                {new int[]{-1, -2, -3, -4, -5, -6, -7, -8, -9, -10}, new int[]{0, -55}},
                {new int[]{1, -2, 3, -4, 5, -6, 7, -8, 9, -10}, new int[]{5, -30}},
                {new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, -10}, new int[]{9, -10}},};
    }

    @Test
    @UseDataProvider("data")
    public void getCountPositiveSumNegative(int[] array, int[] expected) {
        int[] actual = new LoopMethod(array).getCountPositiveSumNegative();
        Assert.assertArrayEquals(expected, actual);
    }
}
