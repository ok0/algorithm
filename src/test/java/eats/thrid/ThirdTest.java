package eats.thrid;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ThirdTest {
    @Test
    public void thirdTest() {
        int serverA = 1;
        String[] paramA = {"1 fracta", "1 sina","1 hana","1 robel","1 abc", "1 sina", "1 lynn"};

        int serverB = 2;
        String[] paramB = {"1 a","1 b","1 abc","3 b","3 a","1 abcd","1 abc","1 aaa","1 a","1 z","1 q", "3 k", "3 q", "3 z", "3 m", "3 b"};

        String[] answerA = {"sina", "hana", "robel", "abc", "lynn"};
        String[] answerB = {"abc", "abcd", "aaa", "z", "q", "k", "q", "z", "m", "b"};

        Solution solution = new Solution();
        Assert.assertEquals(Arrays.toString(solution.solution(serverA, paramA)), Arrays.toString(answerA));
        Assert.assertEquals(Arrays.toString(solution.solution(serverB, paramB)), Arrays.toString(answerB));
    }
}
