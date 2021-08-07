package programmers.hash.camouflage;

import org.junit.Assert;
import org.junit.Test;

public class CamouflageTest {
    @Test
    public void camouflageTest() {
        String[][][] testCase = {
                {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}},
                {{"crowmask", "face"}, {"bluesunglasses", "face"}, {"smoky_makeup", "face"}}
        };

        Solution solution = new Solution();
        Assert.assertEquals(solution.solution(testCase[0]), 5);
        Assert.assertEquals(solution.solution(testCase[1]), 3);
    }
}
