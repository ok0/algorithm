package programmers.hash.phone_book;

import java.util.HashSet;

class Solution {
    public boolean solution(String[] phoneBook) {
        HashSet<String> map = new HashSet<String>();
        for (String phone: phoneBook) {
            map.add(phone);
        }

        for (String phone: phoneBook) {
            for (int idx = 1 ; idx < phone.length() ; idx++) {
                String sub = phone.substring(0, idx);
                if (map.contains(sub)) {
                    return false;
                }
            }
        }

        return true;
    }
}