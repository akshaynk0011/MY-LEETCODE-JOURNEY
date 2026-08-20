import java.util.*;

class Solution {

    public List<Integer> majorityElement(int[] nums) {

        int candidate1 = 0;
        int candidate2 = 0;

        int count1 = 0;
        int count2 = 0;

        // Step 1: Find possible candidates
        for (int i = 0; i < nums.length; i++) {

            // If candidate1 has no votes,
            // take current number as candidate1.
            // But make sure it is not already candidate2.
            if (count1 == 0 && nums[i] != candidate2) {

                candidate1 = nums[i];
                count1 = 1;
            }

            // If candidate2 has no votes,
            // take current number as candidate2.
            // But make sure it is not already candidate1.
            else if (count2 == 0 && nums[i] != candidate1) {

                candidate2 = nums[i];
                count2 = 1;
            }

            // Current number matches candidate1.
            else if (nums[i] == candidate1) {

                count1++;
            }

            // Current number matches candidate2.
            else if (nums[i] == candidate2) {

                count2++;
            }

            // Different from both candidates.
            else {

                count1--;
                count2--;
            }
        }

        // Step 2: Verify actual frequencies
        count1 = 0;
        count2 = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == candidate1) {
                count1++;
            }

            if (nums[i] == candidate2) {
                count2++;
            }
        }

        List<Integer> answer = new ArrayList<>();

        if (count1 > nums.length / 3) {
            answer.add(candidate1);
        }

        // Make sure we don't add the same candidate twice
        if (candidate2 != candidate1 &&
            count2 > nums.length / 3) {

            answer.add(candidate2);
        }

        return answer;
    }
}