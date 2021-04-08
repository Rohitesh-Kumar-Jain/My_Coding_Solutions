class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int[] ans = new int[k];
        Map<Integer,Set<Integer>> idMinuteList = new HashMap<>();
        for (int i=0; i < logs.length; i++) {
            Set<Integer> minuteList = idMinuteList.getOrDefault(logs[i][0], new HashSet<Integer>());
            minuteList.add(logs[i][1]);
            idMinuteList.put(logs[i][0], minuteList);
        }
        for (Set<Integer> set : idMinuteList.values()) {
            ans[set.size() - 1]++;
        }
        return ans;
    }
}