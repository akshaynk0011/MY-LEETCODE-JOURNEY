import java.util.*;

class Solution {

    public List<Integer> majorityElement(int[] nums) {

        int el1 = 0, el2 = 1;
        int cnt1 = 0, cnt2 = 0;

        // Find two possible candidates
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == el1) {
                cnt1++;
            } 
            else if (nums[i] == el2) {
                cnt2++;
            } 
            else if (cnt1 == 0) {
                el1 = nums[i];
                cnt1 = 1;
            } 
            else if (cnt2 == 0) {
                el2 = nums[i];
                cnt2 = 1;
            } 
            else {
                cnt1--;
                cnt2--;
            }
        }

        // Verify candidates
        cnt1 = 0;
        cnt2 = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == el1) cnt1++;
            if (nums[i] == el2) cnt2++;
        }

        List<Integer> ans = new ArrayList<>();

        if (cnt1 > nums.length / 3) {
            ans.add(el1);
        }

        if (cnt2 > nums.length / 3 && el1 != el2) {
            ans.add(el2);
        }

        return ans;
    }
}