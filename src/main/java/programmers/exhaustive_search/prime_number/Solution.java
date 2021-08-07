package programmers.exhaustive_search.prime_number;

import java.util.HashSet;
import java.util.Set;

class Solution {
    private static final Set<Integer> set = new HashSet<>();

    public int solution(String numbers) {
        for (int idx = 0 ; idx < numbers.length() ; idx++) {
            setPrimeNumbers(numbers.split(""), 0, idx+1);
        }

        return 0;
    }

    private void setPrimeNumbers(String[] arr, int depth, int length) {
        // finished
        if (depth == length) {
            return;
        }

        // process
        String s = "";
        for (int i = 0 ; i < depth ; i++) {
            s += arr[i];
        }
        set.add(Integer.parseInt(s));

        // recursive
        for (int i = 0 ; i < depth ; i++) {
            swap(arr, i, i+1);
            setPrimeNumbers(arr, depth + 1, length);
        }
    }

    private String[] swap(String[] arr, int i, int j) {
        String tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;

        return arr;
    }
}