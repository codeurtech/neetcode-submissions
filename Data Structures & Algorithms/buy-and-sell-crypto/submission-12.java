class Solution {
    public int maxProfit(int[] prices) {

        int left = 0;
        int right = left+1;
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int price: prices) {
            if(price<minPrice) {
                minPrice=price;
            } else {
                maxProfit = Math.max(maxProfit, price-minPrice);
            }

        }
        return maxProfit;
    }
}
