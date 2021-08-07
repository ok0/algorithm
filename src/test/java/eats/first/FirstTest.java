package eats.first;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class FirstTest {
    @Test
    public void firstTest() {
        String[] a = {"alex pizza pasta", "alex pizza pizza", "alex noodle", "bob pasta", "bob noodle sandwich pasta", "bob steak noodle"};
        String[] b = {"alex pizza pasta steak", "bob noodle sandwich pasta", "choi pizza sandwich pizza", "alex pizza pasta steak"};

        Solution solution = new Solution();
        Assert.assertEquals(Arrays.toString(solution.solution(a)), Arrays.toString(new String[]{"bob"}));
        Assert.assertEquals(Arrays.toString(solution.solution(b)), Arrays.toString(new String[]{"alex", "bob"}));
    }
}
