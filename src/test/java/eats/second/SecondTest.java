package eats.second;

import org.junit.Assert;
import org.junit.Test;

public class SecondTest {
    @Test
    public void secondTest() {
        Solution solution = new Solution();

        Assert.assertEquals(solution.solution(5, 3, 2), 9);
        Assert.assertEquals(solution.solution(6, 5, 4), 29);
    }

    @Test
    public void secondTest2() {
        Solution2 solution = new Solution2();

        Assert.assertEquals(solution.solution(5, 3, 2), 9);
        Assert.assertEquals(solution.solution(6, 5, 4), 29);
    }
}
