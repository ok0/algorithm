package programmers.hash.runner;

import org.junit.Assert;
import org.junit.Test;

public class RunnerCamouflageTest {

    @Test
    public void runnerTest() {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        Assert.assertEquals("leo", new Solution().solution(participant, completion));
    }
}
