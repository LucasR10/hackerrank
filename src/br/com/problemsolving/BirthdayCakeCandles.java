package br.com.problemsolving;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
 * 
 * @author Lucas Carvalho
 *         https://www.hackerrank.com/challenges/birthday-cake-candles/problem
 * 
 */

public class BirthdayCakeCandles {

	//@Test
	public void BirthdayCakeCandlesCase1() {
		/**
		 * Sample Input 
		 * 82, 49, 82, 82, 41, 82, 15, 63, 38, 25
		 */
		int[] arr = { 82, 49, 82, 82, 41, 82, 15, 63, 38, 25 };
		Assert.assertEquals(4, BirthdayCakeCandles.birthdayCakeCandles(arr) );
	}
	
	@Test
	public void BirthdayCakeCandlesCase2() {
		/**
		 * Sample Input 
		 * 18 90 90 13 90 75 90 8 90 43
		 */
		int[] arr = { 18, 90, 90, 13, 90, 75, 90, 8, 90, 43 };
		Assert.assertEquals(5, BirthdayCakeCandles.birthdayCakeCandles(arr) );
	}

	//EstudarDepois
	static int birthdayCakeCandles(int[] numeros) {
		
		int maxCandleHeight = Integer.MIN_VALUE;
        int maxCandleFreqCount = 0;
		 
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == maxCandleHeight) {
				maxCandleFreqCount++;
			}
			
			if( numeros[i] > maxCandleHeight ) {
				maxCandleHeight = numeros[i];
				maxCandleFreqCount = 1;
			}
		}
        
		return maxCandleFreqCount;
	}


	


}
