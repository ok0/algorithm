package practice.hash.runner;

import java.util.Arrays;

public class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);
        int idx = 0;
        for (String part: participant) {
            if ((idx == (participant.length-1)) || !part.equals(completion[idx])) {
                answer = part;
                break;
            }

            idx++;
        }

        return answer;
    }
}