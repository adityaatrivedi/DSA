public class LC121 {
    public static void main(String[] args) {
        int[] prices = {7, 6, 4, 3, 1};
        System.out.println(maxProfit(prices));
    }

    static int maxProfit(int[] prices) {
        // find min element
        // ignore all indices before that minimum index
        // find max element after min and prices.length
        // return MAX - MIN
        int minIndex = min(prices);
        int maxIndex = max(prices, minIndex);

        // If min is the last index, no day to sell after buying
        if (minIndex == prices.length - 1) {
            return 0;
        }

        return prices[maxIndex] - prices[minIndex];
    }

    static int min(int[] prices) {
        int minVal = Integer.MAX_VALUE;
        int minIndex = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minVal) {
                minVal = prices[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    static int max(int[] prices, int start) {
        int maxVal = Integer.MIN_VALUE;
        int maxIndex = start;
        for (int i = start; i < prices.length; i++) {
            if (prices[i] > maxVal) {
                maxVal = prices[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}