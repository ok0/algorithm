package programmers.hash.camouflage;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (String[] c: clothes) {
            map.put(c[1], map.getOrDefault(c[1], 0)+1);
        }


        int answer = 1;
        for (int count: map.values()) {
            answer *= (count+1);
        }

        return answer - 1;
    }
}
