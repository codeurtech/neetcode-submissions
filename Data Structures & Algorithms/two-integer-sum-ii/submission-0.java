class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right=numbers.length-1;
        int[] res = new int[2];
        while(left<right) { // [1,2,3,4]
            int currentSum = numbers[left]+numbers[right];
            if(currentSum == target) // 1+2 = 3
            {
                System.out.println("Entering if");
                res[0] = left+1;
                res[1] = right+1;
                break;
            }
            if(currentSum>target) right--; // 1+2>3; 3
            if(currentSum<target) left++; // 3
        }
        return res;
    }
}
