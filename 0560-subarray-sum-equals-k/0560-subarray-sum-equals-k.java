import java.util.HashMap;

class Solution {

    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int prefixSum = 0;
        int count = 0;

        map.put(0, 1);

        for (int i = 0; i < nums.length; i++) {

            prefixSum = prefixSum + nums[i];

            int remaining = prefixSum - k;

            if (map.containsKey(remaining)) {

                count = count + map.get(remaining);
            }

            if (map.containsKey(prefixSum)) {

                map.put(prefixSum, map.get(prefixSum) + 1);

            } else {

                map.put(prefixSum, 1);
            }
        }

        return count;
    }
}