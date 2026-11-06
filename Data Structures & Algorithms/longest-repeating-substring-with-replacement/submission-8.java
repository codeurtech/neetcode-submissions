class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        Map<Character,Integer> countMap = new HashMap<>();
        int maxf = 0;
        int res = 0;

        for(int right = 0; right<s.length(); right++) {
            countMap.put(s.charAt(right),
            countMap.getOrDefault(s.charAt(right), 0) + 1);
            maxf = Math.max(maxf, countMap.get(s.charAt(right)));

            while((right - left + 1) - maxf > k) {
                countMap.put(s.charAt(left), countMap.get(s.charAt(left)) - 1);
                left++;
            }

            res = Math.max(res, (right - left + 1));
        }
        return res;
    }
}
