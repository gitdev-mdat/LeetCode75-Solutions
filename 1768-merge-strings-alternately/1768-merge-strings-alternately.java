class Solution {
    public String mergeAlternately(String word1, String word2) {
        int length1 = word1.length();
        int length2 = word2.length();
        int max = Math.max(length1,length2);
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < max) {
            if (i < length1) {
                sb.append(word1.charAt(i));
            } 
            if (i < length2) {
                sb.append(word2.charAt(i));
            }    
            i++;
    }
    return sb.toString();
}
}