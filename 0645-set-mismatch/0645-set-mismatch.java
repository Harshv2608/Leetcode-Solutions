class Solution {
    public int[] findErrorNums(int[] nums) {
        long n = nums.length;
        long sum = (n * (n + 1L)) / 2L;
        long ssum = (n * (n + 1L) * (2L * n + 1L)) / 6L;

        long rsum = 0L;
        long rssum = 0L;
        for (int x : nums) {
            rsum += x;
            rssum += (long) x * x;
        }

        long diff = rsum - sum;           // dup - missing
        long sumDiff = (rssum - ssum) / diff; // dup + missing

        int dup = (int) ((diff + sumDiff) / 2L);
        int missing = (int) (sumDiff - dup);

        return new int[]{dup, missing};
    }
}