class Solution {

    public int shipWithinDays(int[] weights, int days) {

        int low = 0;
        int high = 0;

        for (int i = 0; i < weights.length; i++) {

            low = Math.max(low, weights[i]);
            high = high + weights[i];
        }

        while (low <= high) {

            int capacity = low + (high - low) / 2;

            int requiredDays = 1;
            int currentWeight = 0;

            for (int i = 0; i < weights.length; i++) {

                if (currentWeight + weights[i] <= capacity) {

                    currentWeight = currentWeight + weights[i];

                } else {

                    requiredDays++;
                    currentWeight = weights[i];
                }
            }

            if (requiredDays <= days) {

                high = capacity - 1;

            } else {

                low = capacity + 1;
            }
        }

        return low;
    }
}