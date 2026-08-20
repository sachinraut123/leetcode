class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        if ((long) m * k > bloomDay.length) {
            return -1;
        }

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int i = 0; i < bloomDay.length; i++) {
            high = Math.max(bloomDay[i], high);
            low = Math.min(bloomDay[i], low);
        }

        int ans = -1;

        while (low <= high) {

            int middle = low + (high - low) / 2;

            int flower = 0;
            int booquet = 0;

            for (int i = 0; i < bloomDay.length; i++) {

                if (bloomDay[i] <= middle) {

                    flower++;

                    if (flower == k) {
                        booquet++;
                        flower = 0;
                    }

                } else {
                    flower = 0;
                }
            }

            if (booquet >= m) {
                ans = middle;
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }

        return ans;
    }
}