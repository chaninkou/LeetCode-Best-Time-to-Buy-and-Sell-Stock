package stock;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] prices = {7,1,5,3,6,4};
		
		System.out.println("Input: " + Arrays.toString(prices));
		
		GetMaxProfitFunction solution = new GetMaxProfitFunction();
		
		System.out.println("Solution: " + solution.maxProfit(prices));
	}
}
