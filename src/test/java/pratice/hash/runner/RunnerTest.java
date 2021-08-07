package pratice.hash.runner;

import org.junit.Assert;
import org.junit.Test;
import practice.hash.runner.Solution;

public class RunnerTest {

    @Test
    public void runnerTest() {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        Assert.assertEquals("leo", new Solution().solution(participant, completion));
    }
}
