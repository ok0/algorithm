package programmers.exhaustive_search.prime_number;

import org.junit.Assert;
import org.junit.Test;

public class PrimeNumberTest {
    @Test
    public void primeNumberTest() {
        Solution solution = new Solution();
        Assert.assertEquals(solution.solution("17"), 3);
        Assert.assertEquals(solution.solution("011"), 2);
    }
}
