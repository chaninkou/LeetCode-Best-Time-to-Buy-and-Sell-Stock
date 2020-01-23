package stock;

public class GetMaxProfitFunction {
	// Easy to understand solution, O(n)
	public int maxProfit(int[] prices){
		// keep track of min and max
		int currentMin = Integer.MAX_VALUE;
		int max = 0;
		
		// Starting from first element 
		for(int currentElement : prices){
			// Get the smallest min of the whole array
			currentMin = Math.min(currentElement, currentMin);
			
			// Get the biggest number in the array that is on the right of the min
			max = Math.max(currentElement - currentMin, max);
		}
		
		return max;
	}
	
	
	// Kadane's Algorithm
//    public int maxProfit(int[] prices) {
//        int maxCurrent = 0;
//        int maxFinal = 0;
//        
//        // Starts from 1 since i - i-1
//        for(int i = 1; i < prices.length; i++){
//            // Keeping track of profit from current element to previous element
//        	// Cool trick, in the example, maxcurrent will be 0,4,2,5 since it will keep getting the positive number
//            maxCurrent = Math.max(0, maxCurrent += prices[i] - prices[i-1]);
//            
//            // Get the best profit
//            maxFinal = Math.max(maxCurrent, maxFinal);
//        }
//        
//        return maxFinal;
//    }
}
