package programmers.sort.k_number;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class KNumberTest {
    @Test
    public void kNumberTest() {
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {
                {2, 5, 3},
                {4, 4, 1},
                {1, 7, 3}
        };

        Assert.assertEquals(Arrays.toString(new Solution().solution(array, commands)), Arrays.toString(new int[]{5, 6, 3}));
    }
}
