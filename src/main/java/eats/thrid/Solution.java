package eats.thrid;

import java.util.*;

class Solution {
    public String[] solution(int n, String[] records) {
        ArrayList<String> nicknameList = new ArrayList();
        Map<String, Set<String>> nicknameByServer = new HashMap<>();
        Map<String, LinkedList<String>> nicknameByCreatedTime = new HashMap<>();

        for (String record: records) {
            String[] row = record.split(" ");
            String server = row[0];
            String nickname = row[1];

            if (!nicknameByServer.containsKey(server)) {
                nicknameByServer.put(server, new HashSet<>());
            }

            if (!nicknameByCreatedTime.containsKey(server)) {
                nicknameByCreatedTime.put(server, new LinkedList<>());
            }

            if (!nicknameByServer.get(server).contains(nickname)) {
                if (nicknameByCreatedTime.containsKey(server) && nicknameByCreatedTime.get(server).size() == 5) {
                    nicknameByServer.get(server).remove(nicknameByCreatedTime.get(server).poll());
                }

                nicknameByServer.get(server).add(nickname);
                nicknameByCreatedTime.get(server).add(nickname);
            }
        }

        for (String server: nicknameByServer.keySet()) {
            if (nicknameByServer.get(server).size() > 0) {
                nicknameList.addAll(nicknameByCreatedTime.get(server));
            }
        }

        String[] result = new String[nicknameList.size()];
        int idx = 0;
        for (String nickname: nicknameList) {
            result[idx++] = nickname;
        }

        return result;
    }
}