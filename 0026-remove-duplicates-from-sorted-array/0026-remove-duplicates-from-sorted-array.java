class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null) return 0;
        if (nums.length < 1) return 1;
        int count = 1;
        int compareIndex = 0;
        int compareValue = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != compareValue) {
                nums[++compareIndex] = nums[i];
                compareValue = nums[i];
                count++;
            }     
        }
        return count;      
    }
}