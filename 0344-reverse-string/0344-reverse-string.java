class Solution {
    public void reverseString(char[] s) {
        if (s == null || s.length < 2) return;
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char tam = ' ';
            tam = s[left]; 
            s[left] = s[right];
            s[right] = tam;
            left++;
            right--;
        }
    }
}