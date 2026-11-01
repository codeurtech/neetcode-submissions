class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        List<Integer>[] buckets = new List[nums.length+1];

        for(int num:map.keySet()) {
            int frequency = map.get(num);
            if(buckets[frequency]==null) {
                buckets[frequency] = new ArrayList<>();
            }
            buckets[frequency].add(num);
        }

        int[] results = new int[k];
        int resultIndex=0;

        for(int i=(buckets.length)-1;i>=0;i--) {
            if(buckets[i]!=null) {
                for(int num:buckets[i]) {
                    results[resultIndex]=num;
                    resultIndex++;
                    if(resultIndex>=k) {
                        return results;
                    }
                }
            }
        }

        return results;
    }
}
