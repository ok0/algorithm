package programmers.sort.max_number;

import java.util.ArrayList;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";

        ArrayList<String> arr = new ArrayList<>();
        for (int number: numbers) {
            arr.add(String.valueOf(number));
        }

        arr.sort((a, b) -> (b + a).compareTo(a + b));

        for (String s: arr) {
            answer = answer + s;
        }

        if (answer.charAt(0) == '0' && answer.equals("0".repeat(answer.length()))) {
            answer = "0";
        }

        return answer;
    }
}