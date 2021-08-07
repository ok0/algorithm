package eats.first;

import java.util.*;

class Solution {
    public String[] solution(String[] orders) {
        Map<String, Set<String>> map = new HashMap<>();

        for (String order: orders) {
            String[] bill = order.split(" ");
            String customer = bill[0];
            if (!map.containsKey(bill[0])) {
                map.put(customer, new HashSet<String>());
            }

            for (int idx = 1 ; idx < bill.length ; idx++) {
                map.get(customer).add(bill[idx]);
            }
        }

        ArrayList<Integer> foods = new ArrayList<>();
        for (String key: map.keySet()) {
            foods.add(map.get(key).size());
        }

        int max = Collections.max(foods);
        ArrayList<String> vip = new ArrayList<>();
        for (String key: map.keySet()) {
            if (max == map.get(key).size()) {
                vip.add(key);
            }
        }

        Collections.sort(vip);
        String[] result = new String[vip.size()];
        int idx = 0;
        for (String customer: vip) {
            result[idx++] = customer;
        }

        return result;
    }
}