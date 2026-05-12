class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for (int num : nums) {
            int temp = num;
            int divisor = 1;
            while (temp >= 10) {
                temp /= 10;
                divisor *= 10;
            }
            temp = num;
            while (divisor > 0) {
                ans.add(temp / divisor); 
                temp %= divisor;        
                divisor /= 10;          
            }
        }
        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }
        return result;
    }
}