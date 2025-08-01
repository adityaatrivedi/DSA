public class LC1432 {
    public static void main(String[] args) {

    }
        static int maxScore(int[] cardPoints, int k) {
            int sum = 0;
            int n = cardPoints.length;

            // If k == total number of cards, return sum of all
            if (k == n) {
                for (int i = 0; i < n; i++) {
                    sum += cardPoints[i];
                }
                return sum;
            }

            // Take first k cards as initial sum
            for (int i = 0; i < k; i++) {
                sum += cardPoints[i];
            }

            int maxSum = sum;

            // Slide window: remove from left, add from right
            for (int i = 1; i <= k; i++) {
                sum = sum - cardPoints[k - i] + cardPoints[n - i];
                maxSum = Math.max(maxSum, sum);
            }

            return maxSum;
        }
    }
