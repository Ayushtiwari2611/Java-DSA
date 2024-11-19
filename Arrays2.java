public class Arrays2 {

    // subarrays in an array
    public static void subarrayInArray(int numbers[]) {
        int countTotalSubarrays = 0;
        for (int i = 0; i <= numbers.length - 1; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                }
                countTotalSubarrays++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("countTotalSubarrays : " + countTotalSubarrays);
    }

    // Maximum Subarray Sum (Brute Force)
    public static void maxSubarraySum(int numbers[]) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i <= numbers.length - 1; i++) {
            int start = i;
            for (int j = i; j <= numbers.length - 1; j++) {
                int end = j;
                currentSum = 0;
                for (int k = start; k <= end; k++) {
                    currentSum = currentSum + numbers[k];
                }
                System.out.println(currentSum);
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("Maximum sum is " + maxSum);
    }

    // Maximum sum of subarray (Prefix Sum)
    public static void maxSubarrayUsingPrefixSum(int numbers[]) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        // calculate prefix array
        for (int i = 1; i <= prefix.length - 1; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currentSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("Max Sum using Prefix Sum : " + maxSum);
    }

    // Kadane's Algorithm to find out max sum of subarray
    public static void kadanesAlgorothim(int numbers[]) {
        int currentSum = 0, maxSum = Integer.MIN_VALUE;

        for (int i = 0; i <= numbers.length - 1; i++) {
            currentSum = currentSum + numbers[i];
            if (currentSum < 0) {
                currentSum = 0;
            }
            maxSum = Math.max(currentSum, maxSum);
        }
        System.out.println("Maximum Sum : " + maxSum);
    }

    // Trapping Rainwater : Given n positive integers representing an elevation map
    // where the width of each bar is 1, compute how much water it can trap after
    // raining
    public static int trappedWater(int height[]) {
        int n = height.length;
        // calculate left max boundary
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], height[i - 1]);
        }
        // calculate right max boundary
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int trappedWater = 0;
        // loop
        for (int i = 0; i < n; i++) {
            // waterLevel = min(leftMaxBound, rightMaxBound)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // trappedWater = waterLevel - height[i]
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }

    // buy and sell stock prices
    public static int buySellStockPrices(int prices[]) {
        int buyprice = Integer.MAX_VALUE, maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buyprice < prices[i]) { // Profit
                int Profit = prices[i] - buyprice; // Today's Profit
                maxProfit = Math.max(maxProfit, Profit);
            } else {
                buyprice = prices[i];
            }
        }
        return maxProfit;
    }

    // Assignment question-1
    public static boolean checkDistinctValues(int numbers[]) {
        for (int i = 0; i <= numbers.length - 1; i++) {
            for (int j = i + 1; j <= numbers.length - 1; j++) {
                if (numbers[i] == numbers[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // Assignment question-3
    public static int stockPrice(int [] numbers){
        int buyingPrice = Integer.MAX_VALUE, maxProfit = 0;
        for(int i=0; i<=numbers.length-1; i++){
            if(numbers[i] > buyingPrice){
                int profit = numbers[i] - buyingPrice;
                maxProfit = Math.max(profit, maxProfit);
            } else{
                buyingPrice = numbers[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        int numbers2[] = { 1, -2, 6, -1, 3 };
        int numbers3[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int trappedWater[] = { 4, 2, 0, 6, 3, 2, 5 };
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        int checkDistinct [] = {1,2,3,4,1};
        subarrayInArray(numbers);
        maxSubarraySum(numbers);
        maxSubarrayUsingPrefixSum(numbers2);
        kadanesAlgorothim(numbers3);
        System.out.println("Trapping water is " + trappedWater(trappedWater));
        System.out.println("Max Profit : " + buySellStockPrices(prices));
        System.out.println(checkDistinctValues(checkDistinct));
        System.out.println("Max Profit : " + stockPrice(prices));
    }
}
