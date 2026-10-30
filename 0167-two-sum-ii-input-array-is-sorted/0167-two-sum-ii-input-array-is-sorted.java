class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2]; 
        if (numbers.length == 0 || numbers.length == 1) return result ;
        int x = 0;
        int y = numbers.length - 1;
        while (x != y) {
         if (numbers[x] + numbers[y] > target) y--;
         else if (numbers[x] + numbers[y] < target) x++;
         else if (numbers[x] + numbers[y] == target) {
            result[0] = ++x;
            result[1] = ++y;
            return result;
        }     
        }
        return result;
    }
}