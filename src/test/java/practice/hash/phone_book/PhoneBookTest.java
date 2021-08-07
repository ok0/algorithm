package practice.hash.phone_book;

import org.junit.Assert;
import org.junit.Test;

public class PhoneBookTest {
    @Test
    public void phoneBookTest() {
        String[][] testCase = {
                {"119", "97674223", "1195524421"}, // false
                {"123","456","789"}, // true
                {"12","123","1235","567","88"} // false
        };

        Assert.assertFalse(new Solution().solution(testCase[0]));
        Assert.assertTrue(new Solution().solution(testCase[1]));
        Assert.assertFalse(new Solution().solution(testCase[2]));
    }
}
