package stock;

public class GetMaxProfitFunction {
    public int maxProfit(int[] prices) {
        int maxCurrent = 0;
        int maxFinal = 0;
        
        for(int i = 1; i < prices.length; i++){
            // Keeping track of profit from current element to previous element
            maxCurrent = Math.max(0, maxCurrent += prices[i] - prices[i-1]);
            
            // Get the best profit
            maxFinal = Math.max(maxCurrent, maxFinal);
        }
        
        return maxFinal;
    }
}
