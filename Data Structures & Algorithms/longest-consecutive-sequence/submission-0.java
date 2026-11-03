class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> set = Arrays.stream(nums)
                         .boxed()
                         .collect(Collectors.toSet());
        // [2,20,4,10,3,4,5]                 
        int longest = 0;
        for(int n:nums) {
            if(!set.contains(n-1)) {
                int length = 0;
                while(set.contains(n + length)) {
                    length++;
                }
                longest = Math.max(length, longest);
            }
        }
        return longest;
    }
}
