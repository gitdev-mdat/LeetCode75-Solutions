class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
    int len = flowerbed.length;
    if (flowerbed == null) return false;
    if (len == 1) {
        if (flowerbed[0] == 0 || n == 0) return true;
        return false;
    }
    if (flowerbed[0] == 0 && flowerbed[1] == 0) {n--;}
    int i = 1;
    int exp = 0;
    if (len > 2) {
        while (i < len-2) {
        if (flowerbed[i] ==0) {
            exp++;       
        } 
        else {
            exp = 0;
        } 
        if (exp == 2 && flowerbed[i+1] == 0) {
            n--;
            exp = 0;
        }
        i++;    
    }
    if (flowerbed[len-1] == 0 && flowerbed[len-2] == 0) {n--;}
    }
    if (n <= 0) return true;
    return false;
}
}