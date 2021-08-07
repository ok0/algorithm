package programmers.exhaustive_search.pre_exam;

import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[][] patterns = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        int[] score = new int[patterns.length];

        for (int idx = 0 ; idx < answers.length ; idx++) {
            for (int idx2 = 0 ; idx2 < patterns.length ; idx2++) {
                if (patterns[idx2][idx % patterns[idx2].length] == answers[idx]) {
                    score[idx2]++;
                }
            }
        }
        int[] student = new int[score.length];
        System.arraycopy(score, 0, student, 0, score.length);

        Arrays.sort(score);
        ArrayList<Integer> highScoreStudent = new ArrayList<>();
        for (int idx = 0 ; idx < student.length ; idx++) {
            if (student[idx] == score[score.length-1]) {
                highScoreStudent.add(idx+1);
            }
        }

        int[] answer = new int[highScoreStudent.size()];
        for (int idx = 0 ; idx < highScoreStudent.size() ; idx++) {
            answer[idx] = highScoreStudent.get(idx);
        }

        return answer;
    }
}