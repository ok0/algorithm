package programmers.exhaustive_search.pre_exam;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class PreExamTest {
    @Test
    public void preExamTest() {
        int[][] answer = {
                {1,2,3,4,5},
                {1,3,2,4,2}
        };

        Solution solution = new Solution();
        Assert.assertEquals(Arrays.toString(solution.solution(answer[0])), Arrays.toString(new int[]{1}));
        Assert.assertEquals(Arrays.toString(solution.solution(answer[1])), Arrays.toString(new int[]{1,2,3}));
    }
}
