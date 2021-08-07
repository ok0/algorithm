package programmers.sort.max_number;

import org.junit.Assert;
import org.junit.Test;

public class MaxNumberTest {
    @Test
    public void maxNumberTest() {
        int[][] cases = {
            {6, 10, 2},
            {3, 30, 34, 5, 9}
        };

        Solution solution = new Solution();
        Assert.assertEquals(solution.solution(cases[0]), "6210");
        Assert.assertEquals(solution.solution(cases[1]), "9534330");
    }
}
