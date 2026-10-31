class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean seen = false;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++) {
            if(set.contains(nums[i])) {
                seen = true;
                break;
            }
            set.add(nums[i]);
        }
        return seen?true:false;
    }
}